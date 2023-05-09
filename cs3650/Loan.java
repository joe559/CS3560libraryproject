package cs3560;

import java.time.LocalDate;
import application.Student;

public class Loan {
    private Student student;
    private Item item;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private double price;
    private boolean returned;
    
 // constructor
    public Loan(Student student, Item item, LocalDate loanDate, LocalDate dueDate, double price, boolean returned) {
        this.student = student;
        this.item = item;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.price = price;
        this.returned = returned;
    }

    // getters and setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public void calculatePrice() {
    }

    public void addFine() {
    }
}

