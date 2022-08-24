package com.teamtreehouse.vending;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditorTest {
    private Creditor creditor;

    @BeforeEach
    void setUp() throws Exception {
        creditor = new Creditor();
    }

    @AfterEach
    void tearDown() throws Exception{

    }

    @Test
    public void testAddFund() throws Exception {
        creditor.addFunds(30);
        creditor.addFunds(30);
        assertEquals(60, creditor.getAvailableFunds());
    }

    @Test
    void testDeduct() throws Exception {
        creditor.addFunds(30);
        creditor.deduct(20);
        assertEquals(10, creditor.getAvailableFunds());
    }
}