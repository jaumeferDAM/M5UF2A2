/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m5uf2a2.CostPersonal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaume
 */
public class TreballadorTest {

    public TreballadorTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCostPersonal() {

        System.out.println("cp");
            
        float expResult = 0;
        float result = CostPersonal.getCostFinal();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testCalcularCostFinal() {

        System.out.println("test1");
        float expResult = 0;
        float result = CostPersonal.calcularCostFinal();
        assertEquals(expResult, result, 0.0);
    }
}
