package com.neo4j.recapNeo4j.DataAcces;

import java.util.Collection;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.neo4j.recapNeo4j.Entities.User;

public interface UserRepository extends Neo4jRepository<User, Long> {

	
	@Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
	Collection<User> getAllUsers();
	
}
