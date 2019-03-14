package com.step.assignments.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableLibrary {
    private final String location;
    private final List<String> books;


    public ImmutableLibrary(String location, List<String> books) {
        this.location = location;
        this.books = new ArrayList<>(books);
    }

    public String getLocation() {
        return location;
    }

    public List<String> getBooks() {
        //unmodifiable list can be created by using the method Collections.unmodifiableList(list);
        return books;
    }

    public static void main(String[] args) {
        new ImmutableLibrary("Bangalore",new ArrayList<>());
    }
}
