/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */

public abstract class Game {

      int playerScore = 0;
      int computerScore = 0;
      
      ArrayList playerCardsList = new ArrayList();
      ArrayList computerCardsList = new ArrayList();
      
      boolean palyerLose = false;
      boolean computerlose = false;
      
      int cardID = 1;
      boolean ComputerContinue = true;
      
      public Game(){
          
          GroupOfCards gc = new GroupOfCards();
          
          gc.shuffle();
          gc.display();
          
      }
    
      public void playerTurn(){
           playerCardsList.add(GroupOfCards.getOneCard(52));
           
           if(playerScore > 21){
               palyerLose = true;
           }
           System.out.println("Player lost!");
      }
      
     public static void main(String[] args) {
        
        
    }
   
    
}//end class
