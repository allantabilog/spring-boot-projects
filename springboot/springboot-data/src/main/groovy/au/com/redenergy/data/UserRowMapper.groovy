package au.com.redenergy.data

import org.springframework.jdbc.core.RowMapper

import java.sql.ResultSet
import java.sql.SQLException

class UserRowMapper implements RowMapper{
    @Override
    Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(id: rs.getInt("id"), name: rs.getString("name"), email: rs.getString("email"))
    }
}
