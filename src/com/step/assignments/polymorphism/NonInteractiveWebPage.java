package com.step.assignments.polymorphism;

public class NonInteractiveWebPage implements Displayable,Clickable,Printable {
    @Override
    public void display(String content) {

    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Click doesn't work");
    }
}
