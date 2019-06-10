/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards {
   
//    //The group of cards, stored in an ArrayList
//    private ArrayList <Card> cards;
//    private int size;//the size of the grouping
//    
//    public GroupOfCards(int givenSize){
//        size = givenSize;
//    }
//    
//    /**
//     * A method that will get the group of cards as an ArrayList
//     * @return the group of cards.
//     */
//    public ArrayList<Card> showCards()
//    {
//        return cards;
//    }
//    
//    public void shuffle()
//    {
//        Collections.shuffle(cards);
//    }
//
//    /**
//     * @return the size of the group of cards
//     */
//    public int getSize() {
//        return size;
//    }
//
//    /**
//     * @param givenSize the max size for the group of cards
//     */
//    public void setSize(int givenSize) {
//        size = givenSize;
//    }
    
    static final int size = 52;
    static String suit[] = {"Heart", "Club", "Diamond", "Spade"};
    static String value[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    static Card card[] = new Card[size];
    
    public void shuffle(){
        
        for(int i = 0; i < card.length; i++){
            i = (int)(Math.random());
            int t = (int)(Math.random() * 10 + i);
            Card temp = card[i];
            card[i] = card[t];
            card[t] = temp;
        }
    }

    public static String[] getSuit() {
        return suit;
    }

    public static void setSuit(String[] suit) {
        GroupOfCards.suit = suit;
    }

    public static String[] getValue() {
        return value;
    }

    public static void setValue(String[] value) {
        GroupOfCards.value = value;
    }

    public static Card[] getCard() {
        return card;
    }

    public static void setCard(Card[] card) {
        GroupOfCards.card = card;
    }
    
    public Card getONeCard(int n){
        return card[n-1];
    }
    
    public void display(){
        for(int i = 0; i < size; i++){
            System.out.println(card[i]);
        }
    }    
    
}//end class
