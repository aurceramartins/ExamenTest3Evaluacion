/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentest3evaluacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Urcera
 */
public class CalculoTest {

    public CalculoTest() {
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
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 2;
        int num2 = 2;
        Calculo instance = new Calculo();
        int expResult = 2;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);

    }

}
