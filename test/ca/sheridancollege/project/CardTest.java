/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of getFace method, of class Card.
     */
    @Test
    public void testGetFace() {
        System.out.println("getFace");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getFace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canPlace method, of class Card.
     */
    @Test
    public void testCanPlaceGood() {
       /* System.out.println("canPlace");
        Card o = "[Blue 2]";
        String c = "Red";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
*/
    }
   
  
}
