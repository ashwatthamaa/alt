package com.pankaj.test.alt;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pankaj.test.alt.model.Person;

public class PersonResourceTest extends AltApplicationTests{
	
	private static final Logger logger = LoggerFactory.getLogger(PersonResourceTest.class);

	@Test
	//@Ignore
	public void test() throws JsonProcessingException, Exception {
		Person p = new Person();
		p.setName("Pankaj");
		ResultActions actions = getMockMvc().perform(post("/persons")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(new ObjectMapper().writeValueAsString(p)));
		ResultActions actions1 = getMockMvc().perform(get("/persons")
				.contentType(MediaType.APPLICATION_JSON_VALUE));
		MvcResult result = actions1.andReturn();
		logger.info(result.getResponse().getContentAsString());
	}

}
