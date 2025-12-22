package com.example.demo.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin (origins = "*")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping("/demo")
	public String demo() {
		return "ebi";
	}
	
	@PostMapping("/addData")
	public UserEntity addData(@RequestBody UserEntity user) {
		return service.inseartData(user);
	}
	@GetMapping("/userdata")
	public List<UserEntity> getData(){
		return service.viewData();
	}
		
}
