package com.step.assignments.polymorphism;

public class PDFPage implements Printable{
    @Override
    public String getContent(){
        return "This is some dummy content";
    }
}
