package ro.sit.homework.homework03_Library;

public class Author {

    //variables to store author's name and email
    String name;
    String email;

    //constructor for author class
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //get the name and email of the author
    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }
}

