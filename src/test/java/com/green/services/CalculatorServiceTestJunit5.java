package com.green.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {

    @BeforeAll
    public static void init(){
        System.out.println("This will execute before all test cases");
    }

    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("Before each test case");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("This is custom name")
    public void addTwoNumbersTest(){
        System.out.println("First Test case");
       int actualResult = CalculatorService.addTwoNumbers(12,12);
       int expectedResult = 24;
        Assertions.assertEquals(expectedResult,actualResult,"Test failed");
    }

    @Test
    @Disabled
    public void addAnyNumbersTest(){
        System.out.println("Second Test case");
       int result = CalculatorService.sumAnyNumbers(1,2,3,4);
       int expected = 10;
       Assertions.assertEquals(expected,result);
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test cases");
    }

//    @Tag
//    @Nested
//    @TestFactory
}
