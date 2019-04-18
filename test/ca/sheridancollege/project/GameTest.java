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
public class GameTest {
    
    /**
     * Test of getGameName method, of class Game.
     */
    @Test
    public void testGetGameName() {
        System.out.println("getGameName");
        Game instance = null;
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = null;
        ArrayList<Player> expResult = null;
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = null;
        Game instance = null;
        instance.setPlayers(players);
    }

    /**
     * Test of play method, of class Game.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Game instance = null;
        instance.play();
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Game instance = null;
        instance.declareWinner();
    }

     /**
     * Test of draw method, of class Game.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        int cards = 0;
        ArrayList<Card> deck = null;
        Game.draw(cards, deck);
    }

    public class GameImpl extends Game {

        public GameImpl() {
            super("");
        }

        public void play() {
        }

        public void declareWinner() {
        }
    }
    
}
