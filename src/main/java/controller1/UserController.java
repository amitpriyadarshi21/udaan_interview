package controller1;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Demo;
import model.User;
import model.UserId;
import service.DemoService;
import service.UserDao;

@RestController
public class UserController {

	@Autowired
	private DemoService demoService;
	
	
	@Resource 
	UserDao userDao;
	
//	@GetMapping(value = "/studentList")
//	public List<Student> getEmployees() {
//	return studentDao.findAll();
//
//	}
	
	@PostMapping(value = "/createUser")
	public void createUser(@RequestBody User user) {
		userDao.insertUser(user);

	}
	
	@PostMapping(value = "/createAdmin")
	public void createAdmin(@RequestBody UserId userId) {
		userDao.insertAdmin(userId);

	}
	
	
	


//	@PostMapping(path = "/add") // Map ONLY POST Requests
//	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
//
//		User n = new User();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
//		return "Saved";
//	}

//	@GetMapping(path = "/all")
//	public @ResponseBody Iterable<User> getAllUsers() {
//		return userRepository.findAll();
//	}

}
