package com.pankaj.test.alt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="Id", nullable=false)
	private Long id;
	
	@Column(name="Name", length=64, nullable=true)
	private String name;

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
