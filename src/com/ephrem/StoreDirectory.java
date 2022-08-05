package com.ephrem;

import java.util.Arrays;

/**
 * EPHREM KIDANE
 * ID#: 182580
 * FINAL PROJECT
 */

public class StoreDirectory {
	private Bookstore bookstore;
	private Market market;
	public StoreDirectory(String custId){
		bookstore = new Bookstore(custId);
		market = new Market();
	}

	public int getNumberOfBooks() {
		return bookstore.getNumBooks();
	}
	public int getNumberOfBookstoreEmployees() {
		//implement
		return bookstore.getNumEmployees();
	}
	public boolean addNewEmployee(String employeeId,String fname){
		//implement

		return  bookstore.addNewEmployee(employeeId,fname);
	}
	public boolean bookIsInStock(String bookId){
		//implement

		return bookstore.bookIsInStock(bookId);
	}
	public boolean addNewBook(String bookId, String title){
		//implement

		return bookstore.addNewBook(bookId,title);
	}
	public boolean marketCarriesFoodItem(String foodItem){
		//implement
		//market.carriesFoodItem(foodItem);
		return market.carriesFoodItem(foodItem);
	}
	public void displayStoreDirectory() {
		bookstore.printTheBooks();
		bookstore.printTheEmployees();
		System.out.println("List of Market Items");
		System.out.println(Arrays.toString(market.STORE_ITEMS));
	}

	public void loadData() {
		bookstore.loadData();
	}
}
