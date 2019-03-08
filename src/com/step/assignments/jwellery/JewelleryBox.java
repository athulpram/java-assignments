package com.step.assignments.jwellery;

public class JewelleryBox {
    private int size;
    private int maxCapacity;
    private int contentSize = 0;
    private int jwelleryBoxes = 0;
    private int jwellerys = 0;

    public JewelleryBox(int size, int maxCapacity) {
        this.size = size;
        if(this.size<2) this.size=2;
        this.maxCapacity = maxCapacity;
        if(this.size<this.maxCapacity) this.maxCapacity=this.size-1;
    }


    public void addJwelleryBox(JewelleryBox jwelleryBox){
        if(jwelleryBox.getSize()<=maxCapacity - contentSize) {
            contentSize += jwelleryBox.getSize();
            jwelleryBoxes++;
            System.out.println("jwellery box added to the box");
            return;
        }
        System.out.println("no more space in jewellery box");
        return;
    }

    public void addJwellery(Jewellery jwellery){
        if(jwellery.getSize()<=maxCapacity - contentSize){
            contentSize += jwellery.getSize();
            jwellerys++;
            System.out.println("Jwellery added to the box");
        }
        System.out.println("no more space in jewellery box");
        return;
    }

    public int getJewelleryBoxes() {
        return jwelleryBoxes;
    }

    public int getJewellerys() {
        return jwellerys;
    }

    public int getSize() {
        return size;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getContentSize() {
        return contentSize;
    }
}
