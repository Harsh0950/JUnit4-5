package com.green.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExampleJunit5 {

//    Assertion - validating expected and actual result

    @Test
    public void test(){
        int actual = 12;
        int expected = 12;
        Assertions.assertEquals(expected,actual);

        int [] actualArray ={1,2,3,4};
        int[] expectedArray = {1,2,3,4};
        Assertions.assertArrayEquals(expectedArray,actualArray);

        String name = new String("Rahul");
        String expectedName = new String("Rahul");
        Assertions.assertSame(expectedName,name);

//        Assertions.assertNotNull();
//        Assertions.assertNull();
//        Assertions.assertTrue();
//        Assertions.assertFalse();
//        Assertions.assertIterableEquals();
//        Assertions.assertThrows();
    }
}
