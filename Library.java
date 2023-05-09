
package cs3560;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import application.Student;

public class Library {
	private List<Student> students;
	private List<Item> items;
	private List<Loan> loans;
	private double revenue;
	
	// constructor
	public Library() {
	    students = new ArrayList<Student>();
	    items = new ArrayList<Item>();
	    loans = new ArrayList<Loan>();
	    revenue = 0;
	}

	// getters and setters
	public List<Student> getStudents() {
	    return students;
	}

	public void setStudents(List<Student> students) {
	    this.students = students;
	}

	public List<Item> getItems() {
	    return items;
	}

	public void setItems(List<Item> items) {
	    this.items = items;
	}

	public List<Loan> getLoans() {
	    return loans;
	}

	public void setLoans(List<Loan> loans) {
	    this.loans = loans;
	}

	public double getRevenue() {
	    return revenue;
	}

	public void setRevenue(double revenue) {
	    this.revenue = revenue;
	}

	// other methods
	public void addStudent(Student student) {
	    // add a new student to the list of students
	}

	public void removeStudent(Student student) {
	    // remove a student from the list of students
	}

	public void addItem(Item item) {
	    // add a new item to the list of items
	}

	public void removeItem(Item item) {
	    // remove an item from the list of items
	}

	public List<Item> searchItemsByTitle(String title) {
		return items;
	    // search for items by title and return a list of items that match the search criteria
	}

	public List<Item> searchItemsByAuthor(String author) {
		return items;
	}
	
	public void generateLoan(Student student, Item item, LocalDate dueDate) {
	    // generate a new loan for the given student and item with the given due date
	}

	public void removeLoan(Loan loan) {
	    // remove a loan from the list of loans
	}

	public void calculateRevenue() {
	    // calculate the library's revenue based on the list of loans
	}

	public List<Loan> getOverdueLoans() {
		return loans;
	    // return a list of loans that are overdue
	}

	public void generateReceipt(Loan loan) {
	    // generate a receipt for the given loan
	}

	public void generateRevenueReport(LocalDate startDate, LocalDate endDate) {
	    // generate a revenue report for the given period
	}
}
