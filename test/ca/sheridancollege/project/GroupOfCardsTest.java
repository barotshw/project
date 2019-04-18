/*
 * Humpreet Kaur
 * 991516230
 * Fundamentals of Software Design & Development
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.showCards();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = null;
        instance.shuffle();
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSize method, of class GroupOfCards.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int givenSize = 0;
        GroupOfCards instance = null;
        instance.setSize(givenSize);
    }
    
}
