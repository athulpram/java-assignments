package com.step.assignments.BillBurgers;

public class Hamberger {
    private String breadRollType;
    private String meatType;
    private double basePrice;

    private String topping1;
    private double topping1Price;

    private String topping2;
    private double topping2Price;

    private String topping3;
    private double topping3Price;

    private String topping4;
    private double topping4Price;


    public Hamberger(String breadRollType, String meatType, double basePrice) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public void addFirstTopping(String toppingName,double toppingPrice){
        this.topping1 = toppingName;
        this.topping1Price = toppingPrice;
    }


    public void addSecondTopping(String toppingName,double toppingPrice){
        this.topping2 = toppingName;
        this.topping2Price = toppingPrice;
    }


    public void addThirdTopping(String toppingName,double toppingPrice){
        this.topping3 = toppingName;
        this.topping3Price = toppingPrice;
    }


    public void addFouthTopping(String toppingName,double toppingPrice){
        this.topping4 = toppingName;
        this.topping4Price = toppingPrice;
    }

    public double calculatePrice(){
        double totalPrice = 0;
        if(this.topping1 != null){
            totalPrice += topping1Price;
        }
        if(this.topping2 != null){
            totalPrice += topping2Price;
        }
        if(this.topping3 != null){
            totalPrice += topping3Price;
        }
        if(this.topping4 != null){
            totalPrice += topping4Price;
        }
        return totalPrice;
    }
}
