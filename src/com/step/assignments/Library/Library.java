package com.step.assignments.Library;

import java.util.*;

public class Library {
    private List<Reader> readers = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private Map<Reader,ArrayList<Book>> register = new HashMap<>();


    public List<Reader> getReaders() {
        Iterator it = this.readers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return Collections.unmodifiableList(readers);
    }

    public boolean addReader(Reader reader) {
        if(this.readers.contains(reader)){
            return false;
        }
        this.readers.add(reader);
        System.out.println("Reader was added successfully");
        return true;
    }

    public List<Book> getBooks() {
        Iterator it = this.books.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return Collections.unmodifiableList(books);
    }

    public boolean addBook(Book book) {
        if(this.books.contains(book)){
            return false;
        }
        this.books.add(book);
        System.out.println("Book wa added successfully");
        return true;
    }

    public boolean borrowBook(Reader reader,Book book){
        ArrayList<Book> booksBorrowed = this.register.getOrDefault(reader,new ArrayList<Book>());
        booksBorrowed.add(book);
        this.register.put(reader,booksBorrowed);
        return true;
    }

    public boolean returnBook(Reader reader,Book book){
        if(this.register.containsKey(reader)){
            ArrayList<Book> booksBorrowed = this.register.getOrDefault(reader,new ArrayList<Book>());
            if(booksBorrowed.contains(book)) {
                booksBorrowed.remove(booksBorrowed.indexOf(book));
            }
        }
        return true;
    }

    public boolean searchBook(Book book){
        return this.books.contains(book);
    }

    public Map getRegister(){
        System.out.println(register);
        return this.register;
    }
}
