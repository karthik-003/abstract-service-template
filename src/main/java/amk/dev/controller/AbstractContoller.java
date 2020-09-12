package amk.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import amk.dev.entity.AbstractUser;
import amk.dev.exception.UserNotFoundException;
import amk.dev.service.AbstractService;

@RestController
public class AbstractContoller {


	@Autowired
	AbstractService service;
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<Object> getUserInfo(@PathVariable("userId") long userId) throws UserNotFoundException{
		return ResponseEntity.ok(service.getUserInfo(userId));
	}
	
	@PostMapping("/users/")
	public ResponseEntity<Object> addUser(@RequestBody AbstractUser user){
		return ResponseEntity.ok(service.saveUserInfo(user));
	}
}
