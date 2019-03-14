package com.step.assignments.cards;

public class IdentityCard implements Duplicable {
    private String name;


    public IdentityCard(String name) {
        this.name = name;
    }

    @Override
    public DuplicateIdentityCard getDuplicate() {
        return new DuplicateIdentityCard(this.name);
    }
}
