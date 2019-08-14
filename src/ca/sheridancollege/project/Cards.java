/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author tayad
 */
public class Cards extends Card{
    
    //suit
    public enum Suit{
        HEARTS,DIMONDS,CLUBS,SPADES
    }
 
    //rank
    public enum Number{
        ACE(11),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(10),QUEEN(10),KING(10);
        
        private final int value;
        
        private Number(int value){
            this.value=value;
        }
        
        public int getNumber(){
            return value;
        }
       //ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    
    private Suit suit;
    private Number value;
        
    public Cards(Suit s,Number v){
        this.suit =s;
        this.value=v;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        return getSuit()+"|"+getValue();
    }
    
}
