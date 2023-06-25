package ro.sit.homework.homework03_Library;

public class Book {

    //variables to store book's name, author and price
    String name;
    int year;
    Author author;
    double price;

    //constructor for book class
    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    //get the name, author, price, year of the book
    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getYear() {
        return year;
    }
}

