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
        Customer customer = jdbcTemplate.queryForObject("select id, first_name, last_name from customers where first_name = ?", [firstName] as String[], Customer)
        return customer ? Optional.of(customer) : Optional.empty()

    }
}
