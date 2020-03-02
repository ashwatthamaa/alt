package com.pankaj.test.alt.resource;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.test.alt.model.Person;
import com.pankaj.test.alt.service.PersonService;

@Controller
@RequestMapping(value="/")
public class PersonResource {
	
	@Autowired
	PersonService personService;
	
	private static final Logger logger = LoggerFactory.getLogger(PersonResource.class);
	
	@RequestMapping(value="persons/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> getPersonById(HttpServletRequest request, @PathVariable Long id) {
		logger.info("Fetching person for id: {}", id);
		Person person = personService.getPersonById(id);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
	@RequestMapping(value="persons", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> getPersonById(HttpServletRequest request) {
		logger.info("Fetching all persons");
		List<Person> persons = personService.getAllPersons();
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}
	
	@RequestMapping(value="persons", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> addPerson(HttpServletRequest request, @RequestBody Person person) {
		logger.debug("Creating person with name: {}", person.getName());
		personService.addPerson(person);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
