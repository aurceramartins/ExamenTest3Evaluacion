/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentest3evaluacion;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex Urcera
 */
@RunWith(Parameterized.class)
public class CalculoParamTest {
Calculo cal=new Calculo();
    private int n1, n2;
    private int result;
    private String mensaje;

    @Before
    public void initialize() {
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method

    public CalculoParamTest(int n1, int n2, int result) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = result;
    }
   

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {2,2,2},
            {2,2,1}
            
        });
    }

// This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " +result);
        assertEquals(result,cal.obtenerMCD(n1, n2),0.0);
    }
}
