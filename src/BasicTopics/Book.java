package BasicTopics;

public class Book {

    static int toNoOfBook;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static {
        toNoOfBook = 0;
    }

    {
        toNoOfBook++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "UnKNOW", "Unknown");
    }

    static int getToNoOfBook() {
        return toNoOfBook;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("book is alreeady borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("enjoy the book" + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("hope enjoy the book leave feedback");
        } else {
            System.out.println("this book already in the libraary");
        }
    }

    public static void main(String[] args) {
        Book yogi = new Book("1", "biography", "yogi guru");
        Book myBook = new Book("2");
        yogi.borrowBook();
        myBook.borrowBook();
        yogi.borrowBook();
        yogi.returnBook();
        yogi.returnBook();
    }

}
