package service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.User;

public class UserRowMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {

		User user = new User();
		user.setName(rs.getString("name"));
		user.setPhone(rs.getString("phone"));
		user.setPin(rs.getInt("pin"));
 
        return user;
	}
	

}
