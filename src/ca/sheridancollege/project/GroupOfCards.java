/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents any grouping of cards for a Game.
 * the methods in the class can be implemented if we create child classes extended 
 * from this class.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Munmun Nandi 
 * Date:April 17, 2019 
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    /** this is a constructor that allows  to set the 
     * size of the group of cards and can be instantiated to the child class.
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**group of cards is added in an ArrayList so that  more cards can be 
     * added and deleted and any other modifications can be done
     * 
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize is set for a size of the group of cards.
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
