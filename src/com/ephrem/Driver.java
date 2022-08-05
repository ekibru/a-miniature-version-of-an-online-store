package com.ephrem;

import java.util.Scanner;

/**
 *  EPHREM KIDANE
 *  ID#: 182580
 * FINAL PROJECT
 */

public class Driver {
	private Scanner sc = new Scanner(System.in);
	private String userID;
	private StoreDirectory directory;

	final String CONTINUE = "Review more options? (Y/N)";
	final String line = System.getProperty("line.separator");
	

	public static void main(String[] args){
		new Driver();
	}
	
	public Driver(){
		System.out.println("What is your Id? (An Id is a 3-digit code, like 009.)");

		String userId = sc.nextLine();
		this.userID = userId;
		directory = new StoreDirectory(this.userID);
		directory.loadData();
		String inputString = "Y";
		String outputString = null;
		displayOptions();
		while(!inputString.equalsIgnoreCase("N")){
			inputString = sc.nextLine();

			if(inputString.equalsIgnoreCase("A")){
				displayNumberOfBooks();
			}
			else if(inputString.equalsIgnoreCase("B")){
				displayNumberOfEmployees();
			}
			else if(inputString.equalsIgnoreCase("C")){
				/*outputString = "In Input Area, type in the employee number using this format:"+line+
			"   add employee xxx"+line+"where 'xxx' is the 3-digit code for the employee number.";*///outputString = "the employee "+line;
				//System.out.println(outputString);
				addEmployee();
			}
			else if(inputString.equalsIgnoreCase("D")){

			/*	outputString = "In Input Area, type in the book id number using this format:"+line+
				   "   book xxx"+line+
				   "where 'xxx' is the 3-digit code for the employee number.";
				System.out.println(outputString);*/
//				outputString = line+" book "+line+CONTINUE;
//				System.out.println(outputString);
				checkIfBookIsInStock();

			}
			else if(inputString.equalsIgnoreCase("E")){

			/*	outputString = "In Input Area, type in the book number using this format:"+line+
				   "   add book xxx"+line+
				   "where 'xxx' is the 3-digit code for the book number.";
				System.out.println(outputString);*/
//				outputString =line+" add book "+line+CONTINUE;
//				System.out.println(outputString);
				addBook();
			}

			else if(inputString.equalsIgnoreCase("H")){
				/*outputString = "In Input Area, type in the name of the food item using this format:"+line+
				   "   food nn..."+line+
				   "where 'nn...' represents the name of the food item (like bananas or cherries).";
				System.out.println(outputString);*/
//				outputString = line+" food "+line+CONTINUE;
//				System.out.println(outputString);
				checkWhetherFoodItemInMarket();
			}
			
			else if(inputString.trim().equalsIgnoreCase("Y")){
				displayOptions();
			}
			else if(inputString.trim().equalsIgnoreCase("N")){
				System.out.println("Have a nice day! Bye!");
				System.exit(0);
			}
			else if(inputString.trim().equalsIgnoreCase("V")){
				viewStoreDirectoryItems();
			}
			else {
				System.out.println(line+"I did not understand your response."+line);
				displayOptions();
			}
		}

	}

	//this implementation has been done for you
	void displayNumberOfBooks() {
		int numBooks = directory.getNumberOfBooks();
		if(numBooks > -1){
			System.out.println("Number of books is: "+ numBooks +" (Look for other console messages.)"+line+CONTINUE);
		}

	}
	void displayNumberOfEmployees() {
		int numemps = directory.getNumberOfBookstoreEmployees();
		System.out.println("Number of employees is: " + numemps+ " (Look for other console messages.)"+line+CONTINUE);
	}

	void addEmployee(){

		System.out.println("Enter Employee ID: ");
		String id = sc.nextLine();
		id = id.substring(0,3);
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		boolean isTrue =directory.addNewEmployee(id,name);
		if(isTrue) {
			System.out.println("Employee added successfully");
		}
			System.out.println("(Look for other console messages.)" + line + CONTINUE);

	}
	void addBook(){
		System.out.println("Book ID: ");
		String id = sc.nextLine();
		id = id.substring(0,3);
		System.out.println("Book Title: ");
		String title = sc.nextLine();

		boolean isTrue =directory.addNewBook(id,title);
		if(isTrue) {
			System.out.println("Book added successfully");
		}

		System.out.println("(Look for other console messages.)" + line+CONTINUE);	
	}
	void checkIfBookIsInStock(){
		System.out.println("Book ID: ");
		String book = sc.nextLine();
		if(directory.bookIsInStock(book)){
			System.out.println("Yes, book with bookId "+book+" is in stock");
			}else {
				System.out.println("No, book with bookId "+book+" is not in stock");
			}
		System.out.println("(Look for other console messages.)" + line+CONTINUE);
	}

	void checkWhetherFoodItemInMarket(){
		System.out.print("Enter food item you want to check:");
		String food = sc.nextLine();
		if (directory.marketCarriesFoodItem(food)){
			System.out.println("Yes the market carries "+food);
		}else {
			System.out.println("No, the market do not carries "+food);
		}
		System.out.println("(Look for other console messages.)" + line+CONTINUE);

	}
	void viewStoreDirectoryItems() {
		directory.displayStoreDirectory();
		System.out.println("(Look for other console messages.)" + line+CONTINUE);	
	}
	void displayOptions(){
		String display = "TYPE A LETTER IN INPUT AREA TO MAKE A SELECTION"+line+line+
						 "A. Learn how many books are in bookstore."+line+
						 "B. Learn how many employees are in bookstore."+line+
						 "C. Add an employee to the bookstore."+line+
						 "D. See if a book is in stock in the bookstore."+line+
						 "E. Add a book to the bookstore."+line+
						 "H. See if the market carries a particular food item."+line+
						 "V. Print the Store Directory."+line+
						 "N. Exit the system.";
		System.out.println(display);
	}

}