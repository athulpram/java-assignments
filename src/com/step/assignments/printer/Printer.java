package com.step.assignments.printer;

public class Printer {
    private int tonerLevel;
    private boolean isDuplex;
    private int numberOfPages;

    public Printer(int tonerLevel, boolean isDuplex, int numberOfPages) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.numberOfPages = numberOfPages;
    }
}
