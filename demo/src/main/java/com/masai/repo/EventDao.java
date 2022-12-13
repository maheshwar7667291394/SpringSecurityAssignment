package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.debug.Event;

@Repository
public interface EventDao extends JpaRepository<com.masai.model.Event,Integer>{
	
	public com.masai.model.Event findBytype(String type);
	
	

}
