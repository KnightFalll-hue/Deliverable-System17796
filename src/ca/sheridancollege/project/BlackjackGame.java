/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michael
 */

public abstract class BlackjackGame extends Game {

    private List<String> players = new ArrayList<>();
    private List<Integer> totals = new ArrayList<>();
    private Deck deck;

    public BlackjackGame(String name) {
        super(name);
    }
  
    public void addPlayer(String name) {
        players.add(name);
    }
    
   public void addTotal(int total) {
       totals.add(total);
    }
    
    @Override
    public void declareWinner() {
        int maxValue = 0;
        String winner = null;
        
        for (int i = 0; i < players.size(); i++) {
            if (totals.get(i) <= 21) {
                if (totals.get(i) > maxValue){
                    winner = players.get(i); // Get the name of the player with the highest total
                    maxValue = totals.get(i);
               }   
            }
        }

    // Print the winner's name and their total
    System.out.println("The winner is: " + winner + " with a total of: " + maxValue);
    }

}