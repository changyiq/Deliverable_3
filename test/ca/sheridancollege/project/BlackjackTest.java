/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tayad
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of declareWinner method, of class Blackjack.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
    }

    /**
     * Test of initialDraw method, of class Blackjack.
     */
    @Test
    public void testInititalDraw(){
        
        System.out.println("initialDraw");
        //create test list 
        ArrayList<Cards> cards = new ArrayList<>();
        User user1 = new User("Test Player");
        cards.add(new Cards(Cards.Suit.CLUBS, Cards.Number.ACE));
        cards.add(new Cards(Cards.Suit.DIMONDS, Cards.Number.ACE));
        cards.add(new Cards(Cards.Suit.SPADES, Cards.Number.ACE));
        ArrayList<Cards> expectedHand = new ArrayList<>();
        expectedHand.add(new Cards(Cards.Suit.CLUBS, Cards.Number.ACE));
        expectedHand.add(new Cards(Cards.Suit.SPADES, Cards.Number.ACE));
        Blackjack bk = new Blackjack();
        bk.initialDraw(cards,user1);      
        assertEquals(expectedHand.toString(), user1.getHand().toString());
        
    }
    
    @Test 
    public void testHit(){
        
        System.out.println("initialDraw");
        //create test list 
        ArrayList<Cards> cards = new ArrayList<>();
        User user1 = new User("Test Player");
        cards.add(new Cards(Cards.Suit.CLUBS, Cards.Number.ACE));
        cards.add(new Cards(Cards.Suit.DIMONDS, Cards.Number.ACE));
        cards.add(new Cards(Cards.Suit.SPADES, Cards.Number.ACE));
        Blackjack bk = new Blackjack();
        bk.initialDraw(cards, user1);
        bk.hit(cards,user1); 
        int expectedArrayLength = 3;
        assertEquals(expectedArrayLength, user1.getHand().size());
        
    }
    
}