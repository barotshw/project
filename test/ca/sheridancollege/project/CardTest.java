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
 * @author kaurh
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
        String expResult = "";
        String result = instance.getFace();
        assertEquals(expResult, result);
    }

    /**
     * Test of canPlace method, of class Card.
     */
    @Test
    public void testCanPlace() {
        System.out.println("canPlace");
        Card o = null;
        String c = "";
        Card instance = new Card();
        boolean expResult = false;
        boolean result = instance.canPlace(o, c);
        assertEquals(expResult, result);
    }
    
}
