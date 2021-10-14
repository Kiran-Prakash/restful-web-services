package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {
       private String Name;

	public String getName() {
		return Name;
	}

	public PersonV1() {
		super();
	}

	public PersonV1(String name) {
		super();
		Name = name;
	}

	public void setName(String name) {
		Name = name;
	}
}
