/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player{
    private List<String> handSuit;
    private List<Integer> handValue;
    private String name; //the unique name for this player
    private int total;
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     * @param suit
     * @param value
     */
    public Player(String name){
        this.name = name;
        handSuit = new ArrayList<String>();
        handValue = new ArrayList<Integer>();
        
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    
    
    public void playTurn() {
        createHand();
        createHand();
               
        this.total = handValue.get(0) + handValue.get(1);
        
        System.out.println(getName() + "'s turn. \nHand: \n" + handSuit + "\n" + handValue + "\ntotal: " + total + "\n");
        
    }

    private void createHand(){
        Random rand = new Random();
        int randValue = rand.nextInt(10);
        int randSuit = rand.nextInt(4);
        Deck deck = new Deck();
        Card card = new Card();
        
        deck.setCardValue(randValue);
        handValue.add(deck.getCardValue());
        deck.setCardSuit(randSuit);
        handSuit.add(deck.getCardSuit());
    }
                
    public int getTotal(){
        return total;
    }
       
}
