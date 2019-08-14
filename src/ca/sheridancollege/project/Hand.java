/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author tayad
 */
public class Hand {
    
    ArrayList<Cards> hand = new ArrayList<>();

    int total;
    
    public Cards getCard(int i) {
        return hand.get(i);
    }

    public void setCard(Cards ahand) {
        this.hand.add(ahand);
    }
    
    public ArrayList<Cards> getHand(){
        return hand;
    }
    
    public int getHandValue(ArrayList<Cards> cards){
        
        int value = 0;
        for(int i=0; i<cards.size();i++){
            String[] cardValue = cards.get(i).toString().split("\\|");
            if(cardValue[1].equals("KING") || cardValue[1].equals("QUEEN") || cardValue[1].equals("JACK") || cardValue[1].equals("TEN")){
                value +=10;
            }else if(cardValue[1].equals("TWO")){
                value += 2;
            }else if(cardValue[1].equals("THREE")){
                value += 3;
            }else if(cardValue[1].equals("FOUR")){
                value += 4;
            }else if(cardValue[1].equals("FIVE")){
                value += 5;
            }else if(cardValue[1].equals("SIX")){
                value += 6;
            }else if(cardValue[1].equals("SEVEN")){
                value += 7;
            }else if(cardValue[1].equals("EIGHT")){
                value += 8;
            }else if(cardValue[1].equals("NINE")){
                value += 9;
            }else{
                value+=11;
            }
        }    
        
        for(int i=0; i<cards.size();i++){
            String[] cardValue = cards.get(i).toString().split("\\|");
            if(value>21 && cardValue[1].equals("ACE")){
                value-=10;
            }
        }
        
        return value;
    }
    
}
