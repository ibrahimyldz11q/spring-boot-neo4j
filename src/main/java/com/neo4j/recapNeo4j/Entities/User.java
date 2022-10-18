package com.neo4j.recapNeo4j.Entities;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {
	
	@GraphId
	private int id;
	private String name;
	private String lname;
	private String phone;
	
	
	@Relationship(type = "RATED", direction = Relationship.INCOMING)
	private List<User> users;
	
	public List<User> getAll(){
		return users;
	}
	
	public User() {
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getPhone() {
		return phone;
	}
	

}
