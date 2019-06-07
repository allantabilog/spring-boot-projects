package au.com.redenergy.data.service

import au.com.redenergy.data.Customer
import au.com.redenergy.data.CustomerRowMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class DbCustomerServiceImpl implements CustomerService {

    @Autowired
    JdbcTemplate jdbcTemplate

    @Override
    List<Customer> findAll() {
        return jdbcTemplate.query("select id, first_name, last_name from customers", new CustomerRowMapper())
    }

    @Override
    Optional<Customer> findByName(String firstName) {
        String sql = "select id, first_name, last_name from customers where first_name = '${firstName}'"
        Customer customer = jdbcTemplate.queryForObject(sql, new CustomerRowMapper())
        return customer ? Optional.of(customer) : Optional.empty()

    }
}
