package com.example.testingtesting;

import org.junit.*;
import static org.junit.Assert.*;

public class TestSuite_1 {

    Calculator calc;

    @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Setup test suit, prepare environment, create mocks, log in to databases (@BeforeAll in JUnit5)");
    }

    @Before
    public void Before()
    {
        System.out.println("Prepare test (@BeforeEach in JUnit5)");
    }

    @Test
    public void Test1()
    {
        System.out.println("Test one (1 + 1 = 2)");
        calc = new Calculator();
        int result = calc.add(1,1);
        assertEquals(result, 2);
    }

    @Test
    public  void Test2()
    {
        System.out.println("Test two (2 * 2 = 4)");
        calc = new Calculator();
        int result = calc.multiply(2,2);
        assertEquals(result, 4);
    }

    @Test
    public  void Test3()
    {
        System.out.println("Test three - composite");
        calc = new Calculator();
        int result = calc.add(calc.multiply(2,2), calc.multiply(1,1));
        assertEquals(result, ((2*2) + (1*1)));
    }

    @After
    public void After()
    {
        System.out.println("Clean up after test (@AfterEach in JUnit5)");
    }

    @AfterClass
    public static void AfterClass()
    {
        System.out.println("Tear down environment, log out etc. (@AfterAll in JUnit5)");
    }


}
