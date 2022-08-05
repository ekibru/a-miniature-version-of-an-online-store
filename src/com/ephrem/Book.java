package com.ephrem;
/**
 * EPHREM KIDANE
 * ID#: 182580
 * FINAL PROJECT
 */
public class Book {

	private String id;
	private String title;

	public Book(String theId,String title) {
		id = theId;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

}
