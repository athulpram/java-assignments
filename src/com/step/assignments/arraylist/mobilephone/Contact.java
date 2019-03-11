package com.step.assignments.arraylist.mobilephone;

public class Contact {
    private String name;
    private long number;

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    public void showContact(){
        System.out.println("-------------------------------");
        System.out.println("Name : "+this.getName());
        System.out.println("Number : "+this.getNumber());
        System.out.println("-------------------------------");
    }
}
