/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author michael
 */
import java.util.Scanner;

public class BlackjackGameRunner {

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame("temp") {}; 
           
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            String name = scanner.next();
            
            Player player = new Player (name) {};
            
            player.playTurn();
            game.addPlayer(player.getName());   
            game.addTotal(player.getTotal());
        }
        
        
        
        //game.play();
        game.declareWinner();

        scanner.close();
    }
}
