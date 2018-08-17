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
public class CPU_StartTest {
    
    public CPU_StartTest() {
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
     * Test of calculate method, of class CPU_Start.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        CPU_Start instance = new CPU_Start();
        instance.calculate();

    }

    /**
     * Test of main method, of class CPU_Start.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CPU_Start.main(args);

    }
    
}
