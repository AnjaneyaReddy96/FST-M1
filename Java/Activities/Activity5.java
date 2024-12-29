

	
	// Abstract class Book
	abstract class Book {
	    // Variable to store the title
	    protected String title;

	    // Abstract method to set the title
	    public abstract void setTitle(String title);

	    
	    public String getTitle() {
	        return title;
	    }
	}

	
	class MyBook extends Book {

	    
	    public void setTitle(String title) {
	        this.title = title;
	    }
	}

	
	public class Activity5 {
	    public static void main(String[] args) {
	    	
	        // Create an instance of MyBook
	        MyBook myBook = new MyBook();

	        // Set the title using setTitle
	        myBook.setTitle("To Kill a Mockingbird");

	        // Get and display the title using getTitle
	        System.out.println("The title of the book is: " + myBook.getTitle());
	    }
	}

	
	    
	

