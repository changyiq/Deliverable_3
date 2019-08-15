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
public class UserTest {
    
    public UserTest() {
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
     * Test of setHand method, of class User.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        ArrayList<Cards> cards = new ArrayList<>();
        cards.add(new Cards(Cards.Suit.CLUBS, Cards.Number.ACE));
        User instance = new User("test player");
        instance.setHand(cards.get(0));
        ArrayList<Cards> expectedCard = instance.getHand();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expectedCard,cards);
    }

    /**
     * Test of getHand method, of class User.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        ArrayList<Cards> cards = new ArrayList<>();
        cards.add(new Cards(Cards.Suit.CLUBS, Cards.Number.ACE));
        User instance = new User("test player");
        instance.setHand(cards.get(0));
        ArrayList<Cards> expectedCard = instance.getHand();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expectedCard,cards);
    }
    
}
