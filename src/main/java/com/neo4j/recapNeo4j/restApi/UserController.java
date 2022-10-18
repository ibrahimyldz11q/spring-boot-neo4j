package com.neo4j.recapNeo4j.restApi;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.recapNeo4j.Bussnies.UserManager;
import com.neo4j.recapNeo4j.Entities.User;

@RestController
@RequestMapping("api/neo4j")
public class UserController {

	@Autowired
	private UserManager userManager;
	
	
	@GetMapping("/data")
	public Collection<User> getAll(){
		return userManager.getAll();
	}
	
}
