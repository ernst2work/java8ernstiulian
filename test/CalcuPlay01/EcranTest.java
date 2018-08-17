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
public class EcranTest {
    
    public EcranTest() {
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
     * Test of getCesevede method, of class Ecran.
     */
    @Test
    public void testGetCesevede() {
        System.out.println("getCesevede");
        Ecran instance = new Ecran();
        String expResult = null;
        String result = instance.getCesevede();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCesevede method, of class Ecran.
     */
    @Test
    public void testSetCesevede() {
        System.out.println("setCesevede");
        String cesevede = "Acest mesaj confirma test pozitiv";
        Ecran instance = new Ecran();
        instance.setCesevede(cesevede);

    }

    /**
     * Test of afiseaza method, of class Ecran.
     */
    @Test
    public void testAfiseaza() {
        System.out.println("afiseaza");
        Ecran instance = new Ecran();
        instance.afiseaza();

    }
    
}
