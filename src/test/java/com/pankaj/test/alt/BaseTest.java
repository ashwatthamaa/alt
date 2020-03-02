package com.pankaj.test.alt;

import org.junit.BeforeClass;

public abstract class BaseTest {
	
	@BeforeClass
	public static void setProfile() {
		System.setProperty("spring.profiles.active", "local");
	}
}
