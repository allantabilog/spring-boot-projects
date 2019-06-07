package au.com.redenergy.data

import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootApplication
@Slf4j
@EnableCaching
class Application implements CommandLineRunner {


    @Autowired
    JdbcTemplate jdbcTemplate

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }

    @Override
    void run(String... args) throws Exception {
        jdbcTemplate.execute("drop table customers if exists")
        jdbcTemplate.execute("create table customers(id serial, first_name varchar(255), last_name varchar(255))")
        jdbcTemplate.execute("insert into customers (first_name, last_name) values ('Pepe', 'Templer')")
        jdbcTemplate.execute("insert into customers (first_name, last_name) values ('Joanna', 'Zhao')")
        jdbcTemplate.execute("insert into customers (first_name, last_name) values ('Zeus', 'Myer')")
        jdbcTemplate.execute("insert into customers (first_name, last_name) values ('Tiggy', 'Tabilogy')")
        jdbcTemplate.execute("insert into customers (first_name, last_name) values ('Grampa', 'Tabilogy')")

        jdbcTemplate.query("select id, first_name, last_name from customers", new CustomerRowMapper())
                    .each {Customer customer -> log.info "Customer: ${customer}" }
    }
}
