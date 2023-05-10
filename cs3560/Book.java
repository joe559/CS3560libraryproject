package cs3560;

import java.time.LocalDate;
import java.util.List;

public class Book extends Item {
    private String publisher;
    private LocalDate publicationDate;
    private List<String> authors;
    private int pages;

    public Book(String code, String title, String description, String location, double dailyPrice, String publisher,
            LocalDate publicationDate, List<String> authors, int pages) {
        super(code, title, description, location, available(), publicationDate, dailyPrice);
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.authors = authors;
        this.pages = pages;
    }

    private static boolean available() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


	private String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public String toString() {
        return "Book{" +
                "code='" + getCode() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", dailyPrice=" + getDailyPrice() +
                ", publisher='" + publisher + '\'' +
                ", publicationDate=" + publicationDate +
                ", authors=" + authors +
                ", pages=" + pages +
                '}';
    }
}
