package cs3560;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Student {
    private String name;
    private int id;
    private String email;
    private List<Lock> loans;

    // constructor
    public Student(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        loans = new ArrayList<Lock>();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Lock> getLoans() {
        return loans;
    }

    public void setLoans(List<Lock> loans) {
        this.loans = loans;
    }

    // other methods
    public void addLoan(Lock loan) {
        loans.add(loan);
    }

    public void removeLoan(Lock loan) {
        loans.remove(loan);
    }
}
