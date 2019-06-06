package au.com.redenergy.data

import org.springframework.jdbc.core.RowMapper

import java.sql.ResultSet
import java.sql.SQLException

class CustomerRowMapper implements RowMapper {
    @Override
    Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        new Customer(id: rs.getLong("id"), firstName: rs.getString("first_name"), lastName: rs.getString("last_name"))
    }
}
