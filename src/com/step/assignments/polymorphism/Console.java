package com.step.assignments.polymorphism;

public class Console implements Displayable {

    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
