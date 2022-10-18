package com.neo4j.recapNeo4j.Bussnies;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.recapNeo4j.DataAcces.UserRepository;
import com.neo4j.recapNeo4j.Entities.User;

@Service
public class UserManager {
	
	@Autowired
	UserRepository userRepository;
	

	public Collection<User> getAll(){
		return userRepository.getAllUsers();
	}
	
}
