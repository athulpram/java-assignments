package com.step.assignments.cards;

public class UnoCard implements Duplicable{
    private int number;
    private String color;


    public UnoCard(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public Object getDuplicate() {
        return new DuplicateUnoCard(this.number,this.color);
    }
}
