package service;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import model.User;
import model.UserId;
import service.UserRowMapper;

@Component
public class UserDaoImpl implements UserDao {
	
	public UserDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
NamedParameterJdbcTemplate template; 

@Override
public int findAll() {
  return template.query("select count(*) from user_records", new UserRowMapper()).size();
}
	
	@Override
	public void insertUser(User emp) {
//	 final String sql = "insert into student(id,name ,email) values(:id,:name,:email)";
		final String sql = "insert into user_records(name ,phone,pin) values(:name,:phone,:pin)";

	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
	.addValue("name", emp.getName())
	.addValue("phone", emp.getPhone())
	.addValue("pin", emp.getPin());
	        template.update(sql,param, holder);
	        

	}
	
	@Override
	public void insertAdmin(UserId userId) {
		final String sql = "update user_records set admin=:admin where id =:id";
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("admin",userId.getAdmin())
				.addValue("id", userId.getId());
		template.update(sql, param,new GeneratedKeyHolder());
		
	}
 
}