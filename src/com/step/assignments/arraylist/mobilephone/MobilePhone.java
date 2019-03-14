package com.step.assignments.arraylist.mobilephone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private boolean isPowered;

    private static Scanner scanner = new Scanner(System.in);

    public void turnMobileOn(){
        this.isPowered = true;
        while(this.isPowered){
            printFunctionalities();
            int option = scanner.nextInt();
            switch(option){
                case 1 :    this.viewContacts();
                            break;

                case 2 :    this.addContact();
                            break;

                case 3 :    break;
                case 4 : break;
                case 5 : break;
                default: this.isPowered = false;
            }
        }
    }

    private void addContact() {
        System.out.print("Enter the name : ");
        String name = scanner.next();

        System.out.print("enter");
        long number = scanner.nextLong();
    }

    private void printFunctionalities() {
        System.out.println("Select one of the options from below list......");
        System.out.println("1 . Veiw contacts");
        System.out.println("2 . Add contact");
        System.out.println("3 . Modify contact");
        System.out.println("4 . View Contact");
        System.out.println("5 . Remove Contact");
        System.out.println("Press any other key to exit");
        System.out.print("Enter your choice : ");
    }

    private void viewContacts(){
        for (Contact contact : contacts) {
            contact.showContact();
        }
    }
}
