/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Humpreet Kaur 2019/04/17
 */
package ca.sheridancollege.project;

import java.util.Random; 

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 **/

public class Card 
{
    // Declaring variables of different data types
    public String color;
    public int value;
    private Random rand;
    private String face;

    // Parameterized Constructor
    public Card(int v, String c)
    {
        value = v;
        color = c; 
    }

    // Method that Creates a random card
    public Card()
    {
        rand = new Random();
        value = rand.nextInt(28); 
        // Assigning value
        if (value >= 14) // Check if value is greater than 14 then value = value - 14;
            value -= 14;
        // Assigning color
        rand = new Random();
        // Switch statement for assigning different colors
        switch(rand.nextInt(4) )
        {
            case 0: color = "Red"; 
                break;
            case 1: color = "Green"; 
                break;
            case 2: color = "Blue"; 
                break;
            case 3: color = "Yellow"; 
                break;
        }
        // If the card is a wild card and value is greater than or equal to 13 then none value is assigned to color variable
        if (value >= 13)
            color = "none";
    }

    // Face method to set the face of the card means what players see such as [Red 2]
    public String getFace()
    {
        face = "[";
        if (color != "none")
        {
            face += this.color + " ";
        }
        // Switch sttements to set diffrent faces 
        switch(this.value)
        {
            default: face += String.valueOf(this.value); 
                break;
            case 10: face += "Skip"; 
                break;
            case 11: face += "Reverse"; 
                break;
            case 12: face += "Draw 2"; 
                break;
            case 13: face += "Wild"; 
                break;
            case 14: face += "Wild Draw 4"; 
                break;
        }
        face += "]";
        return face;
    }

    // To ensure that can we place this card on top of a given card
    // Color should be changed for wild card but card should be same
    public boolean canPlace(Card o, String c)
    {
        if (this.color == c)
            return true;
        else if (this.value == o.value)
            return true;
        else if (this.color == "none") // Wild cards
            return true;
        return false;
    }
}
