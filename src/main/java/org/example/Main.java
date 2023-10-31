package org.example;

public class Main {
    public static void main(String[] args) {

        LibraryBook book_1 = new LibraryBook("Harry Potter","J.K. Rowing", "magic");
        LibraryBook book_2 = new LibraryBook("The Ocean At The End Of The Lane","Neil Gaiman", "novel");
        LibraryBook book_3 = new LibraryBook("Master And Margarita","M. Bulgakov", "satire2");

        Library library = new Library();

        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);

        System.out.println(library.SumOfBooks());
    }
}