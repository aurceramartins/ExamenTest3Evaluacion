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
public class VisualizaMensajeTest {

    public VisualizaMensajeTest() {
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
     * Test of visualizar method, of class VisualizaMensaje.
     */
    @Test
    public void testVisualizar() {
        System.out.println("visualizar");
        Calculo cal = new Calculo(2, 2, "Correcto");
        String expResult = "Correcto";
        String result = VisualizaMensaje.visualizar(cal);
        assertEquals(expResult, result);

    }

}
