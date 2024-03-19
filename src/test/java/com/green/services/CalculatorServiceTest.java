package com.green.services;

import org.junit.*;

import java.util.Date;

/**
 * This is Junit 4
 */
public class CalculatorServiceTest {

    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("started time: "+new Date());
//        open connection or open file
    }

    @Before
    public void eachTestCase(){
        System.out.println("Executes before each test case");
    }

//    test method for add two numbers
    @Test
    public void addTwoNumbersTest() {
        System.out.println("test for addTwoNumbersTest");
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void sumAnyNumbers(){
        System.out.println("test for sumAnyNumbers");
        int result = CalculatorService.sumAnyNumbers(2,7,8,9);
        int expected = 26;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test cases");
        System.out.println("Test end time: "+new Date());
    }
}
