package com.pankaj.test.alt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pankaj.test.alt.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Long>{
	
	public Optional<Person> findById(Long id);
	
	public List<Person> findByName(String name);
}
