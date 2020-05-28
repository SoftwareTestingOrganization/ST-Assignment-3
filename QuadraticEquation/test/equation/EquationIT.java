/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TAHA
 */
public class EquationIT {
    
    public EquationIT() {
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
     * Test of main method, of class Equation.
     */
    @Test
    public void testIsQuadratic() {
        Equation e=new Equation();
        assertSame("Invalid Range",e.isQuadratic(-1, -1, -1));
        assertSame("Invalid Range",e.isQuadratic(-1, -1, 100));
        assertSame("Invalid Range",e.isQuadratic(-1, 100, -1));
        assertSame("Invalid Range",e.isQuadratic(-1, 100, 100));
        assertSame("Invalid Range",e.isQuadratic(100, -1, -1));
        assertSame("Invalid Range",e.isQuadratic(100, -1, 100));
        assertSame("Invalid Range",e.isQuadratic(100, 100, -1));
        assertSame("Not a Quadratic Equation",e.isQuadratic(0, 100, 100));
        assertSame("Quadratic Equation",e.isQuadratic(100, 100, 100));
    }
    @Test
    public void testCheckRoots() {
        Equation e=new Equation();
        assertSame("Invalid Range",e.CheckRoots(-1, -1, -1));
        assertSame("Invalid Range",e.CheckRoots(-1, -1, 100));
        assertSame("Invalid Range",e.CheckRoots(-1, 100, -1));
        assertSame("Invalid Range",e.CheckRoots(-1, 100, 100));
        assertSame("Invalid Range",e.CheckRoots(100, -1, -1));
        assertSame("Invalid Range",e.CheckRoots(100, -1, 100));
        assertSame("Invalid Range",e.CheckRoots(100, 100, -1));
        assertSame("Not a Quadratic Equation",e.CheckRoots(0, 100, 100));
        String str1="Equal";
        String str2="Real";
        String str3="Imaginary";
        assertSame(str1,e.CheckRoots(1, 0, 0));
        assertSame(str2,e.CheckRoots(1, 1, 0));
        assertSame(str3,e.CheckRoots(1, 1, 1));
        
    }
    @Test
    public void testCalculateRoots() {
        Equation e=new Equation();
        double []expected=new double[2];
        expected[0]=expected[1]=-1;  
        double res[]=e.calculateRoots(-1,-1,-1);
        
        
        assertArrayEquals(expected,e.calculateRoots(-1, -1, -1),0.0000);
        assertArrayEquals(expected,e.calculateRoots(-1, -1, 100),0.0000);
        assertArrayEquals(expected,e.calculateRoots(-1, 100, -1),0.0000);
        assertArrayEquals(expected,e.calculateRoots(-1, 100, 100),0.0000);
        assertArrayEquals(expected,e.calculateRoots(100, -1, -1),0.0000);
        assertArrayEquals(expected,e.calculateRoots(100, -1, 100),0.0000);
        assertArrayEquals(expected,e.calculateRoots(100, 100, -1),0.0000);
        expected[0]=expected[1]=-2; 
        assertArrayEquals(expected,e.calculateRoots(0, 100, 100),0.0000);
        expected[0]=expected[1]=0; 
        assertArrayEquals(expected,e.calculateRoots(1, 0, 0),0.0000);
    }
}
