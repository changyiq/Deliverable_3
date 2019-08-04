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
public class User extends Player{

    Hand hand = new Hand();
    
    public User(String name) {
        super(name);
        
    }
    
    public Hand getHandObject(){
       return this.hand;
    }
    
    public void play(){
    
    }
    
    public void setHand(Cards cards){
        hand.setCard(cards);
    }
    
    public ArrayList<Cards> getHand(){
        return hand.getHand();
    }
    
//    public ArrayList<Cards> initialDraw(ArrayList<Cards> cards){
//        
//        for(int i=0;i<2;i++){
//            hand.setCard(cards.get(i));
//            cards.remove(i);
//        }   
//        
//        return cards;
//    }  
    
//    public ArrayList<Cards> hit(ArrayList<Cards> cards){
//        int index = (int) Math.random()*((cards.size())+1);
//        hand.setCard(cards.get(index));
//        cards.remove(index);
//        
//        return cards;
//    
//    }
    
}
