package com.ephrem;

/**
 * EPHREM KIDANE
 * ID#: 182580
 * FINAL PROJECT
 */

public class Employee {
	private String id;
	private String fullname;

	public Employee(String theId, String fn) {
		id = theId;
		fullname = fn;
	}

	public String getFullname() {
		return fullname;
	}
	public String getId() {
		return id;
	}
}
