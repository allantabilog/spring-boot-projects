package au.com.redenergy.data.service

import au.com.redenergy.data.Customer
import au.com.redenergy.data.CustomerRowMapper
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.Cacheable
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
@Slf4j
class DbCustomerServiceImpl implements CustomerService {

    @Autowired
    JdbcTemplate jdbcTemplate

    @Override
    @Cacheable("customers")
    List<Customer> findAll() {
        log.info("called findAll()")
        return jdbcTemplate.query("select id, first_name, last_name from customers", new CustomerRowMapper())
    }

    @Override
    @Cacheable("customer")
    Optional<Customer> findByName(String firstName) {
        log.info("called findByName(${firstName})")
        String sql = "select id, first_name, last_name from customers where first_name = '${firstName}'"
        Customer customer = jdbcTemplate.queryForObject(sql, new CustomerRowMapper())
        return customer ? Optional.of(customer) : Optional.empty()

    }
}
