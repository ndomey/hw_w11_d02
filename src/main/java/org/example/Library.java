package org.example;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryBook> books;
    private int stock;

    public Library() {

        this.books = new ArrayList<>();
        this.stock = 1;

    }

    public void addBook(LibraryBook librarybooks){
        if(this.SumOfBooks() < this.stock){
            this.books.add(librarybooks);
        }
    }

    public int SumOfBooks(){
        return this.books.size();
    }
}
