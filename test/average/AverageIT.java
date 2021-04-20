/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlexH
 */
public class AverageIT {
    
    public AverageIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateAverage method, of class Average.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        Average instance = new Average();
        int expResult = 2;
        int result = instance.calculateAverage(num1, num2, num3);
        assertEquals(expResult, result);
    }
    
}
