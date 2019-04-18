/*
 * Humpreet Kaur
 * 991516230
 * Fundamentals of Software Design & Development
 */
package ca.sheridancollege.project;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;*/

/**
 *
 * @author kaurh (Humpreet Kaur)
 */
public class CardTest {
    
    public CardTest() {
    }
    
    /**
     * Test of getFace method, of class Card.
     */
    @Test
    public void testGetFaceGood() {
        System.out.println("getFace Good");
        Card instance = new Card();
        String expResult = "[Blue 2]";
        String result = instance.getFace();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetFaceBad() {
        System.out.println("getFace Bad");
        Card instance = new Card();
        String expResult = "[Orange]";
        String result = instance.getFace();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetFaceBoundary() {
        System.out.println("getFace Boundary");
        Card instance = new Card();
        String expResult = "[Red 5]";
        String result = instance.getFace();
        assertEquals(expResult, result);
    }

    /**
     * Test of canPlace method, of class Card.
     */
    @Test
    public void testCanPlaceGood() {
        System.out.println("canPlace Good");
        Card o = null;
        String c = "Red";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanPlaceBad() {
        System.out.println("canPlace Bad");
        Card o = null;
        String c = "Magenta";
        Card instance = new Card();
        boolean expResult = false;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanPlaceBoundary() {
        System.out.println("canPlace Boundary");
        Card o = null;
        String c = "Blue";
        Card instance = new Card();
        boolean expResult = true;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
    }
    
}
