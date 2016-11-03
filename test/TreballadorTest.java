/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m5uf2a2.CostPersonal;
import m5uf2a2.Treballador;
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
    CostPersonal cp;
    Treballador tr;
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
    public void hello() {
      
        System.out.println("cp");
        String treballador=  tr.getTipusTreballador();
        double expResult = 0;
        double result = cp.costDelPersonal(treballadors);
        assertEquals(expResult, result, 0.0);
        
    }
}
