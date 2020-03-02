package com.pankaj.test.alt;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class AltApplicationTests extends BaseTest{

	@Autowired
	WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setMockMvc() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//		System.setProperty("spring.profiles.active", "local");
	}
	
	/**
	 * @return the wac
	 */
	public WebApplicationContext getWac() {
		return wac;
	}

	/**
	 * @return the mockMvc
	 */
	public MockMvc getMockMvc() {
		return mockMvc;
	}
}
