package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {

    palindrome p1;

    @Before
    public void setUp() throws Exception {
        p1 = new palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palin1(){

        String str = p1.palin1(28882);
        assertEquals("Number is Palindrome and the sum is greater than 25.", str);

    }

}