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
}
