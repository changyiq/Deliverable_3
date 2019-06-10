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
//    private final String gameName;//the title of the game
//    private ArrayList <Player> players;// the players of the game
//    
//    public Game(String givenName)
//    {
//        gameName = givenName;
//        players = new ArrayList();
//    }
//
//    /**
//     * @return the gameName
//     */
//    public String getGameName() 
//    {
//        return gameName;
//    }
//    
//     /**
//     * @return the players of this game
//     */
//    public ArrayList <Player> getPlayers() 
//    {
//        return players;
//    }
//
//    /**
//     * @param players the players of this game
//     */
//    public void setPlayers(ArrayList <Player> players) 
//    {
//        this.players = players;
//    }
//    
//    /**
//     * Play the game. This might be one method or many method calls depending
//     * on your game.
//     */
//    public abstract void play();
//    
//    /**
//     * When the game is over, use this method to declare and display a winning
//     * player.
//     */
//    public abstract void declareWinner();
      int playerScore = 0;
      int computerScore = 0;
      
      ArrayList playerCardsList = new ArrayList();
      ArrayList computerCardsList = new ArrayList();
      
      boolean palyerLose = false;
      boolean computerlose = false;
      
      int cardID = 1;
      boolean ComputerContinue = true;
      
      public Game(){
          GroupOfCards.shuffle();
          GroupOfCards.display();
          
      }
       public void calculatePlayerScore(){
          playerScore = 0;
          for(int i = 0; i < playerCardsList.size(); i++){
            Card card = (Card) playerCardsList.get(i);
            playerScore += Card.getcount();
        }
    }
      public void playerTurn(){
           playerCardsList.add(GroupOfCards.getOneCard(n));
           calculatePlayerScore();
           if(playerScore > 21){
               palyerLose = true;
           }
           System.out.println("Player lost!");
      }
      
      public void calculateComputerScore
   
    
}//end class
