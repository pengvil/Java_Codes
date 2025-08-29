
class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author, boolean IsAvailable){
        System.out.println("Para Book");
        this.bookId = id;
        this.title= title;
        this.author = author;
        this.isAvailable =  IsAvailable;
    }

    public void showDetails(){
        System.out.println("Book id is: " + bookId);
        System.out.println("Title of the book is: " + title);
        System.out.println("Name of the author is: " + author);
        System.out.println("Book is available: " + isAvailable);
    }
}

class Member {
        private int memberId;
        private String name;
        private Book borrowedBook;

        public Member(int id, String name, Book borrowBook){
            this.memberId = id;
            this.name = name;
            this.borrowedBook = borrowBook;
        }

        public void showDetails(){
            System.out.println("Para Member");
            System.out.println("Member id is:" + memberId);
            System.out.println("Name of the member is: "+ name);
            borrowedBook.showDetails();
        }
}


public class Association_Demo_1_1 {
    public static void main(String[] args) {
        // creating an object of the BOOK class
		Book b1 = new Book(0212, "Harry Potter", "JK Rowling" , true);
		// creating an object of the MEMBER class
        Member m1 = new Member(01, "Naim", b1);
        m1.showDetails();
    }
}
