package com.example.testingone;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

    @Test
    public void checkTwoNo(){
        Arthimetic arthimetic = new Arthimetic();
        float expected = 8;
        float actual = arthimetic.add(3,5);
        assertEquals(expected,actual);
    }

    @Test
    public void checkSub(){
        Arthimetic arthimetic = new Arthimetic();
        float expected = 8;
        float actual = arthimetic.subtract(16,8);
        assertEquals(expected,actual);
    }@Test
    public void checkDiv (){
        Arthimetic arthimetic = new Arthimetic();
        float expected = 2;
        float actual = arthimetic.divide(6,3);
        assertEquals(expected,actual);
    }
}
