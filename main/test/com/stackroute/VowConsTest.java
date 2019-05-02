package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowConsTest {

    VowCons v1;

    @Before
    public void setUp() throws Exception {
        v1 = new VowCons();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void vowelcons1(){

        String str1 = v1.vowelcons1("a");
        assertEquals("Vowel", str1);

    }
}