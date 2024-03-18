package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testCalculateArea(){
        assertEquals(3.14159265, App.calculateArea(1d), 0.000001);
    }

    @Test
    public void testSum(){
        assertEquals(1200.5, App.sum(400.3, 800.2), 0);
    }
}
