package com.step.assignments.Library;

public class Book {
    private static int globalId = 1000;
    private final int bookId;
    private final String name;
    private final String auther;

    public Book(String name, String auther) {
        this.name = name;
        this.auther = auther;
        this.bookId= globalId++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
