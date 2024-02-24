package com.example.parcial;

import junit.framework.TestCase;

public class TotalTest extends TestCase {
    private Total total;
    @Override
    protected void setUp() throws Exception{
       super.setUp();
       total=new Total();
    }


    public void testCalculartotal() {
        double resultado=total.Calculartotal(5,3);
        assertEquals(25000,resultado,0.01);

    }
}