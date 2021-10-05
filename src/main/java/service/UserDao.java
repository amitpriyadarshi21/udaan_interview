package service;

import java.util.List;

import model.User;
import model.UserId;

public interface UserDao {
	
	
     int findAll();
    
	void insertUser(User emp);
	void insertAdmin(UserId userId);

}
