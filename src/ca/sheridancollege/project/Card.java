/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card {
    //default modifier for child classes
    private String suit;
    private String value;
    private int count;

    public Card(String suit, String value, int count) {
        this.suit = suit;
        this.value = value;
        
        if(value == "J" || value == "Q" || value == "K")
        {
            this.count = 10;
        }
        else if(value == "A")
        {
            this.count = 1;
        }
        else 
        {
            this.count = Integer.parseInt(value);
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
//        return ""suit= " + Card.getsuit() + ", value=" + Card.getvalue());
        
}


