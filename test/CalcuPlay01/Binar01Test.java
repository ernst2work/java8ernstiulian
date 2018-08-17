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
public class Binar01Test {
    
    public Binar01Test() {
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
     * Test of calculationB method, of class Binar01.
     */
    @Test
    public void testCalculationB() {
        System.out.println("calculationB");
        double x = 2.3;
        double y = 4.2;
        Binar01 instance = new Binar01();
        double expResult = 6.5;
        double result = instance.calculationB(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
}
