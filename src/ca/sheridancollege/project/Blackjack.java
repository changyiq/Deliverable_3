/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;
import jdk.nashorn.internal.codegen.CompilerConstants;
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/**
 *
 * @author tayad
 */
public class Blackjack extends Game{
    
    ArrayList<Cards> playerHand = new ArrayList<>();
    ArrayList<Cards> dealerHand = new ArrayList<>();
    
    public Blackjack() {
        super("Blackjack");
    }
        
    public void play(){
    
    }
    
    public void declareWinner(User player,User dealer, int counter){
    
        int playerHandValue = player.getHandObject().getHandValue(player.getHand());
        int dealerHandValue = dealer.getHandObject().getHandValue(dealer.getHand());
        
        if(dealerHandValue > 21 && playerHandValue < 21){
            System.out.println(player.getPlayerID()+" You Won!!");
            System.exit(0);
        }else if(playerHandValue > 21){
            System.out.println(player.getPlayerID()+ "You Lost the Game ! Try again !");
            System.exit(0);
        }else if(dealerHandValue < 21 && playerHandValue < 21 && counter == 3){
            if(playerHandValue>dealerHandValue){
                System.out.println(player.getPlayerID()+" You Won!!");
            }else if(playerHandValue == dealerHandValue){
                System.out.println("It's Tie!!!");
            }else if(playerHandValue < dealerHandValue){
                System.out.println(player.getPlayerID()+ "You Lost the Game ! Try again !");
            }
            System.exit(0);
        }
       
        
    }
    
     public ArrayList<Cards> initialDraw(ArrayList<Cards> cards,User user){
        
        playerHand = user.getHand();
         
        for(int i=0;i<2;i++){
            user.setHand(cards.get(i));
            cards.remove(i);
        }   
        
        return cards;
    }  
    
    public ArrayList<Cards> hit(ArrayList<Cards> cards,User user){
        int index = (int) Math.random()*((cards.size())+1);
        user.setHand(cards.get(index));
        cards.remove(index);
        
        return cards;
    
    }
    
//    public ArrayList<Cards> intialDraw(ArrayList<Cards> cards){
//    
//        ArrayList<Cards> intialHand = new ArrayList<>();
//        int counter = 0;
//        
//        while(counter<2){
//            int random = 0 + (int)(Math.random() * ((55) + 1));
//            intialHand.add(cards.get(random));
//            cards.remove(random);
//        }
//        
//        
//        return intialHand;
//    }
        
    public static void main(String[] args) {
     
        Blackjack blackjack = new Blackjack();
        
        GroupOfCards deck = new GroupOfCards(56);
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Cards> cards = new ArrayList<>();
        
        boolean play= true;
        int counter =0;
        
        Random random = new Random();
        int round=1;    
        
        System.out.println("Welcome to "+blackjack.getGameName());
        System.err.println("Enter your name:");
        
        User player1 = new User(scan.nextLine());
        players.add(player1);
        
        User dealer = new User("Dealer");
        players.add(dealer);
        
        blackjack.setPlayers(players);
        
        //create deck of cards
        cards = deck.showCards();
        //Shuffles the deck
        deck.shuffle();
        System.out.println(cards);
        
        //sets user initial hand
        blackjack.initialDraw(cards,player1);
        
        System.out.println(player1.getPlayerID()+" Your Hand:");
        System.out.println(player1.getHand());
                
        //sets dealer intial hand
        blackjack.initialDraw(cards, dealer);
        System.out.println("dealer Hand:");
        System.out.println(dealer.getHand());
        
        while(play && counter <4){
            System.out.println("Select you choice");
            
            System.out.println("1.Hit");
            System.out.println("2.Stand");
            System.out.println("3.Exit");
                        
            switch(scan.nextInt()){
            
                case 1: cards = blackjack.hit(cards,player1);
                        cards = blackjack.hit(cards,dealer);
                    break;
                 
                case 2: System.out.println("You Choose not to draw new card");
                        cards = blackjack.hit(cards,dealer);
                    break;
                    
                case 3: System.out.println("You choose to quit the game");
                        System.exit(0);
                    break;
                
            }
                       
            System.out.println(player1.getPlayerID()+"Your hand:");
            System.out.println(player1.getHand());
            System.out.println(player1.getPlayerID()+" Your Hand value: " + player1.getHandObject().getHandValue(player1.getHand()));
            
            System.out.println("Dealer hand:");
            System.out.println(dealer.getHand());
            System.out.println(dealer.getPlayerID()+" Your Hand value: " + dealer.getHandObject().getHandValue(dealer.getHand()));
                        
            blackjack.declareWinner(player1,dealer,counter);
            counter++;
        }
        blackjack.declareWinner(player1,dealer,counter);
        System.exit(0);
        //deck after initial hand        
    }
}
