package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testCalculateArea() {
        assertEquals(3.14159265, App.calculateAreaCircle(1d), 0.000001);
    }



    @Test
    public void testSum() {
        assertEquals(1200.5, App.add(400.3, 800.2), 0.001);
    }


    @Test
    public void TestOutputStringSum(){
        assertEquals("The sum of 400.3 + 800.2 is: 1200.5", App.outputString);
    }

    @Test
    public void testSum2() {
        assertEquals(-1200.5, App.add(-400.3, -800.2), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(400.4, App.subtract(800.6, 400.2), 0.001);
    }

    @Test
    public void testSubtract2() {
        assertEquals(-1.6, App.subtract(800.6, 802.2), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2, App.divide(4, 2), 0.001);
    }

    @Test
    public void testDivide2() {
        assertEquals(.5, App.divide(2, 4), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(8, App.multiply(4, 2), 0.001);
    }

    @Test
    public void testMultiply2() {
        assertEquals(2, App.multiply(4, .5), 0.001);
    }

    @Test
    public void orderOfOperations() {
        double val = App.multiply(2, (App.add(2, 6) + App.add(1, 2)));
        assertEquals(22, val, 0.001);

    }

    @Test
    public void orderOfOperations2() {
        double val = App.multiply(2, App.multiply(App.add(2, 6), App.add(1, 2)));
        assertEquals(48, val, 0.001);

    }
}
