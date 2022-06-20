package com.hcl;

import junit.runner.Version;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    Calculator c = new Calculator();

    @BeforeAll
    static void setUp() {
        System.out.println("The @BeforeAll method is executed only once.");
        System.out.println();
    }

    @AfterAll
    static void tearDown() {
        System.out.println("The @AfterAll method is executed only once.");
        System.out.println();
    }

    @BeforeEach
    public void setUpThis() {
        System.out.println(" The @BeforeEach method is executed.");
    }

    @AfterEach
    public void tearDownThis() {
        System.out.println("The @AfterEach method is executed.");
        System.out.println();
    }


    /**
     * This method will test positive add cases
     */
    @Test
    @Order(1)
    public void positiveAddTestCases() {
        Assertions.assertEquals(10, c.add(5, 5));
        Assertions.assertEquals(30, c.add(20, 10));
    }

    /**
     * This method will test negative add cases
     */
    @Test
    @Order(2)
    @Disabled
    public void negativeAddTestCases() {
        Assertions.assertNotEquals(25, c.add(6, 3));
        Assertions.assertNotEquals(36, c.add(25, 2));
    }

    /**
     * This method will test positive test cases for subtraction
     */
    @Test
    @Order(3)
    @Disabled
    public void positiveSubtractTestCases() {
        Assertions.assertEquals(2, c.subtract(4, 2));
        Assertions.assertEquals(20, c.subtract(30, 10));
    }

    /**
     * This method will test negative test cases for subtraction
     */
    @Test
    @Order(4)
    public void negativeSubtractionTestCases() {
        Assertions.assertNotEquals(12, c.subtract(22, 3));
        Assertions.assertNotEquals(15, c.subtract(35, 14));
    }

    /**
     * This method will test positive test cases for multiplication
     */
    @Test
    @Order(5)
    public void positiveMultiplicationTestCases() {
        Assertions.assertEquals(18, c.multiply(6, 3));
        Assertions.assertEquals(64, c.multiply(8, 8));
    }

    /**
     * This method will test negative test cases for multiplication
     */
    @Test
    @Order(6)
    public void negativeMultiplicationTestCases() {
        Assertions.assertNotEquals(14, c.multiply(5, 2));
        Assertions.assertNotEquals(25, 3, 2);
    }

    /**
     * This method will test positive test cases for division
     */
    @Test()
    @Order(7)
    public void positiveDivisionTestCases() {
        Assertions.assertEquals(5, c.divide(25, 5));
        Assertions.assertEquals(7, c.divide(14, 2));
    }

    /**
     * This method will test negative test cases for division
     */
    @Test
    @Order(8)
    public void negativeDivisionTestCases() {
        Assertions.assertNotEquals(15, c.divide(30, 10));
        Assertions.assertNotEquals(27, c.divide(42, 7));
    }

    /**
     * This method will test positive test cases for mod division
     */
    @Test
    @Order(9)
    public void positiveModTestCases() {
        Assertions.assertEquals(0, c.mod(4, 2));
        Assertions.assertEquals(1, c.mod(9, 2));
    }

    /**
     * This method will test negative test cases for mod division
     */
    @Test
    @Order(10)
    public void negativeModTestCases() {
        Assertions.assertNotEquals(1, c.mod(15, 3));
        Assertions.assertNotEquals(2, c.mod(4, 2));
    }

    /**
     * This method will test positive test cases for squaring
     */
    @Test
    @Order(11)
    public void positiveSquareTestCases() {
        Assertions.assertEquals(16, c.square(4, 2));
        Assertions.assertEquals(125, c.square(5, 3));
    }

    /**
     * This method will test negative test cases for squaring
     */
    @Test
    @Order(12)
    public void negativeSquareTestCases() {
        Assertions.assertNotEquals(64, c.square(3, 4));
        Assertions.assertNotEquals(45, c.square(2, 3));
    }

    /**
     * This method will test positive test cases for square root
     */
    @Test
    @Order(13)
    public void positiveSquareRootTestCases() {
        Assertions.assertEquals(12, c.squareRoot(144));
        Assertions.assertEquals(4, c.squareRoot(16));
    }

    /**
     * This method will test negative test cases for square root
     */
    @Test
    @Order(14)
    public void negativeSquareRootTestCases() {
        Assertions.assertNotEquals(-12, c.squareRoot(144));
        Assertions.assertNotEquals(56, c.squareRoot(64));
    }

    @Test
    @Order(15)
    public void calculateTest1()
    {
        System.out.println("In test 1. Doing assertAll");
        Assertions.assertAll("Multiplication, Division, and Square root ",
                () -> assertEquals(20, c.multiply(4,5)),
                () -> assertEquals(5, c.divide(10,2)),
                () -> assertEquals(5,c.squareRoot(25)));


    }

}