package com.step.assignments.Library;

public class Librarian {
    public static void main(String[] args) {
        Library nationalLibrary = new Library();

        Reader reader1 = new Reader("reader one name");
        Reader reader2 = new Reader("reader two name");
        Reader reader3 = new Reader("Reader three name");

        Book book1 = new Book("5point someone","Chetan");
        Book book2 = new Book("The White Tiger","Aravind");
        Book book3 = new Book("The Alchemist","paulo");

        nationalLibrary.addReader(reader1);
        nationalLibrary.addReader(reader2);
        nationalLibrary.addReader(reader3);

        System.out.println("the readers in the library are "+nationalLibrary.getReaders());

        nationalLibrary.addBook(book1);
        nationalLibrary.addBook(book2);
        nationalLibrary.addBook(book3);

        System.out.println("the books in the library are "+nationalLibrary.getBooks());

        nationalLibrary.borrowBook(reader1,book1);
        nationalLibrary.borrowBook(reader2,book2);
        nationalLibrary.borrowBook(reader3,book3);

        System.out.println("the register of library is "+nationalLibrary.getRegister());

        nationalLibrary.returnBook(reader1,book1);

        System.out.println("the register of library is "+nationalLibrary.getRegister());
    }
}
