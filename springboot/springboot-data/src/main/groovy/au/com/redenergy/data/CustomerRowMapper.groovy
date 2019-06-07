package au.com.redenergy.data

import org.springframework.jdbc.core.RowMapper

import java.sql.ResultSet
import java.sql.SQLException

class CustomerRowMapper implements RowMapper {
    @Override
    Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
    }
}
