/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcuPlay01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i.an
 */
public class Binar03Test {
    
    public Binar03Test() {
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
     * Test of calculationB method, of class Binar03.
     */
    @Test
    public void testCalculationB() {
        System.out.println("calculationB");
        double x = 2.2;
        double y = 4.7;
        Binar03 instance = new Binar03();
        double expResult = 10.34;
        double precision = 0.001*expResult;
        double result = instance.calculationB(x, y);
        assertEquals(expResult, result, precision);
// test fails at absolute precision: third parameter of assertEquals = 0.0
// therefore i tested for certain precision, and i did not like absolute, but relative [pervcentage] precision
// like 0.01% of expected result
    }
    
}
