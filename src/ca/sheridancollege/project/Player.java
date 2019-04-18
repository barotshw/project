/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Humpreet Kaur 2019/04/17
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 **/


// This class has a sub-class thus using the concept of inheritance.
// This class is also an abstract class thus completing the requirement for Dependancy Inversion.
abstract public class Player 
{
    private String playerID; //the unique ID for this player
    
    /**
     * A parameterized constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        playerID= name;
    }
    
    /**
     * getter to get playerID
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * setter to set the playerID
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    /**
     * Method play is overridden method which is overridden in Game class and it's body is changed according to Game.java class
     * Using the concept of Overridden and inheritance thus fulfilling the Open Closed Principle.
     */
    public void play() {
        System.out.println("");
    }
    
}
