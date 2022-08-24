package com.teamtreehouse.vending;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

class BinTest {

    private Bin bin;

    @BeforeEach
    void setUp() throws Exception {
        bin = new Bin(30);
    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    void restockingWithDifferentItem() throws Exception  {
        bin.restock("Potato", 1, 50, 100);
       // bin.restock("Tomato", 1, 100, 50);
    }
}