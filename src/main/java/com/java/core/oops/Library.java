package com.java.core.oops;

import java.util.ArrayList;
import java.util.List;

class Book{
    String title;
    String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", Author='" + author + '\'' +
                '}';
    }
}
public class Library {
    String libraryName;
    List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        // In composition, the Library is responsible for creating and destroying its parts.
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library.
    public void addBook(String title, String author) {
        // The Library creates the Book object internally.
        Book book = new Book(title, author);
        books.add(book);
    }
    // Display all books in the library.
    public void displayBooks() {
        System.out.println("Books in " + libraryName + ":");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    // Close the library. In composition, this action destroys the parts (books).
    public void closeLibrary() {
        System.out.println("Closing library: " + libraryName);
        // Clear the list to simulate destruction of all book objects.
        books.clear();
    }
}

class LibraryRunner{
    public static void main(String[] args) {
        Library library=new Library("Town N Country Library");

        //Add Books
        library.addBook("Tom N Jerry","Steve");
        library.addBook("Festive","Narayana");
        library.addBook("Diversity","Hari");

        //display books
        library.displayBooks();
        System.out.println("\n now closing library");

        library.closeLibrary();
        System.out.println("\n After Closing library book object is not Existing");
         library.displayBooks();


    }
}
