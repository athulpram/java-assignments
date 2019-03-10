package com.step.assignments.BillBurgers;

public class HealthyBurger extends Hamberger {
    private String topping5;
    private double topping5price;

    private String topping6;
    private double topping6price;

    public HealthyBurger(String meatType, double basePrice) {
        super("brown rye", meatType, basePrice);
    }

    public void addFifthTopping(String topping,double toppingPrice){
        this.topping5 = topping;
        this.topping5price = toppingPrice;
    }

    public void addSixthTopping(String topping,double toppingPrice){
        this.topping6 = topping;
        this.topping6price = toppingPrice;
    }

    public double calculatePrice(){
        double totalPrice;
        totalPrice = super.calculatePrice();

        if(this.topping5 != null){

        }
        return totalPrice;
    }
}
