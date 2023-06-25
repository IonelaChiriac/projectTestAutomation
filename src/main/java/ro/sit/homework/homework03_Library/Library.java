package ro.sit.homework.homework03_Library;

public class Library {
    public static void main(String[] args) {

        //creating an author and a book
        Author author = new Author("James Clear", "james.clear@library.com");
        Book book = new Book("Atomic Habits", 2018, author, 10.00);

        //output book's details
        System.out.println("Book " + book.getName() + " " + book.getPrice() + " RON by " + book.getAuthor().getName() + " published in " + book.getYear());
    }
}

//output
//Book Atomic Habits 10.0 RON by James Clear published in 2018

