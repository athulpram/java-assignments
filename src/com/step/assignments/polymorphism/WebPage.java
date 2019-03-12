package com.step.assignments.polymorphism;

public class WebPage implements Displayable,Printable,Clickable {
    @Override
    public void display(String content) {
        System.out.println(content);
    }

    @Override
    public String getContent() {
        return "This is a dummy string";
    }

    @Override
    public void click() {
        System.out.println("Clicked........");
    }
}
