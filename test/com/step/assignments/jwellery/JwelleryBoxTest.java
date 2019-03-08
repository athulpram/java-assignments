package com.step.assignments.jwellery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwelleryBoxTest {
    private JewelleryBox jewelleryBox;

    @Test
    void addJwelleryToBoxTest() {
        JewelleryBox jewelleryBox = new JewelleryBox(5,4);
        JewelleryBox smallBox = new JewelleryBox(3,2);
        Jewellery ring = new Jewellery("gold",1000, 1);

        jewelleryBox.addJwelleryBox(smallBox);
        jewelleryBox.addJwellery(ring);

        assertEquals(5,jewelleryBox.getSize());
        assertEquals(4,jewelleryBox.getContentSize());


    }
//    @Test
//    void name() {
//        JewelleryBox _5thLevelBox = new JewelleryBox();
//
//        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);
//
//        Jewellery nacklace = new Jewellery("necklace");
//        JewelleryBox _3rdLevelBox = new JewelleryBox(nacklace, _4thLevelBox);
//
//        Jewellery ring = new Jewellery("ring");
//        JewelleryBox _2ndLevelBox = new JewelleryBox(ring, _3rdLevelBox);
//
//        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);
//
//        assertEquals(2, _1stLevelBox.totalJewelleries());
//    }

}