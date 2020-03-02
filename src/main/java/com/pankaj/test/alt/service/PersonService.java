package com.pankaj.test.alt.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankaj.test.alt.dao.PersonDao;
import com.pankaj.test.alt.model.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao personDao;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	public Person getPersonById(Long id) {
		logger.info("Service started");
		return personDao.findById(id).get();
	}
	
	public List<Person> getAllPersons() {
		logger.info("service started");
		List<Person> personsList = new ArrayList<>();
		Iterator<Person> persons = personDao.findAll().iterator();
		while(persons.hasNext()) {
			personsList.add(persons.next());
		}
		return personsList;
	}
	
	public void addPerson(Person person) {
		personDao.save(person);
	}
}
