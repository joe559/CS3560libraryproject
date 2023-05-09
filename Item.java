

package cs3560;

import java.time.LocalDate;

public class Item {
    private String title;
    private String author;
    private String director;
    private String genre;
    private boolean available;
    private LocalDate dueDate;
    private double dailyPrice;
    
    // constructor
    public Item(String title, String author, String director, String genre, 
    		boolean available, LocalDate dueDate, double dailyPrice) {
        this.title = title;
        this.author = author;
        this.director = director;
        this.genre = genre;
        this.available = available;
        this.dueDate = dueDate;
        this.dailyPrice = dailyPrice;
    }
    
    // getters and setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    public double getDailyPrice() {
        return dailyPrice;
    }
    
    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
}
