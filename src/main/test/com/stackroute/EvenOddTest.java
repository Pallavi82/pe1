package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd e1;

    @Before
    public void setUp() throws Exception {
        e1 = new EvenOdd();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void evenodd1(){

        String str = e1.evenodd1(23);
        assertEquals("Tom",str);

    }
}