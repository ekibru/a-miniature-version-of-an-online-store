package com.ephrem;

/**
 * EPHREM      KIDANE
 * ID#: 182580
 * FINAL PROJECT
 */
class Bookstore {
	private static final int DEFAULT_NO_OF_EMPLOYEES = 20;
	private static final int DEFAULT_NO_OF_BOOKS = 100;
	private String id =null;
	private Book [] books;
	private Employee[] employees;

	public Bookstore(String theId) {
		id = theId;
		books = new Book[DEFAULT_NO_OF_BOOKS];
		employees = new Employee[DEFAULT_NO_OF_EMPLOYEES];
	}
	
	public int getNumBooks() {
		int count =0;
		for(int i=0; i<books.length;i++){
			if(books[i]!=null)
				count++;
		}

	// Implement to return how many Books are stored in the employees array

		return count;
	}

	public int getNumEmployees() {
		int empCount =0;
		for (int i = 0; i <employees.length ; i++) {
			if(employees[i]!=null)
				empCount++;
		}
		//System.out.println(empCount);
		// Implement to return how many Employees  are stored in the books array
	return empCount;
	}
	
	public boolean addNewBook(String bookId, String title) {

		for ( int i = 0; i < books.length; i++) {
			if (books[i]==null) {
				books[i] = new Book(bookId, title);
				return true;
			}

		}
		return false;
		//throw new ArrayIndexOutOfBoundsException("No more space.");

	/*Implement to add a new book into the end, 
	 which means if the books array has already 
	 five books stored from the index 0 to 4 means, 
	 the new book will add into the index 5. */
	}
	public boolean addNewEmployee(String employeeId, String name) {
		//Scanner k = new Scanner(System.in);
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] == null) {
				employees[i] = new Employee(employeeId, name);
				return true;
			}
		}

			return false;

		/*Implement to add a new Employee into the end,
		 which means if the employees array has already
		 five employee stored from the index 0 to 4 means,
		 the new employee will add into the index 5.
		 If successfully added return true else false*/


			//return false;

	}

	public boolean bookIsInStock(String bookId) {
		for (int i = 0; i < books.length; i++) {
			if(books [i]==null) {
				return false;
			}
			else if(books [i].getId().equals(bookId)) {
				return true;
			}

		}
		/* Check the given bookId exists in the 
		 * books array return true else return false;
		 */
		return false;
	}

	// Remove the comment line after implementing addNewBook() and addNewEmployee
		public void loadData() {
			// Default five books
			addNewBook("101","Java 8 Fundamentals");
			addNewBook("102","Beginners Java");
			addNewBook("103","Data Structures");
			addNewBook("104","Learn Java");
			addNewBook("105","Learn HTML");
			// Default five Employees
			addNewEmployee("201","Tom Bruck");
			addNewEmployee("202","Hong Lu");
			addNewEmployee("203","Tim Bruce");
			addNewEmployee("204","Anne Mary");
			addNewEmployee("205","Vicki Scott");
		}
	public void printTheBooks() {
		System.out.println("List of Books");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null)
				System.out.println(books[i].getId() + ", "+books[i].getTitle());
		}
		System.out.println();
	}
	public void printTheEmployees() {
		System.out.println("List of Employee");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null)
				System.out.println(employees[i].getId() + ", " + employees[i].getFullname());
			}
		System.out.println();
	}
	public static void main(String[] args) {
	// Remove the comment lines to test your logic
		Bookstore bs = new Bookstore("123");
		bs.addNewBook("301","JavaFX Fundamentals");
		bs.addNewBook("302","Software Testing");
		bs.printTheBooks();
		bs.addNewEmployee("501","Paul Corozza");
		bs.addNewEmployee("502","Keith Levi");
		bs.printTheEmployees();
		System.out.println(bs.bookIsInStock("301"));
		System.out.println(bs.bookIsInStock("306"));
	}
}
