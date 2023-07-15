package com.springrest.springrest.Controller;
//import org.apache.catalina.connector.Response;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String root() {
		return "Hello World";
	}
	
	// Get Users
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return this.userService.getUsers();
	}
	
	// Get User by ID
	@GetMapping("/users/id/{userID}")
	public User getUser(@PathVariable String userID)
	{
		return this.userService.getUser(Long.parseLong(userID));
	}

//	 Get User by username
	@GetMapping("/users/username/{username}")
	public User getUserByUser(@PathVariable String username)
	{
		return this.userService.getUsersByUsers(username);
	}
	
	// Add User
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	// Update User by ID
	@PutMapping("/users")
	public User UpdateUser(@RequestBody User user) {
		return this.userService.UpdateUser(user);
	}
	
	// Delete User by ID
	@DeleteMapping("/users/{userID}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userID){
		try {
			this.userService.deleteUser(Long.parseLong(userID));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
