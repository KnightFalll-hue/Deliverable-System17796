/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Arrays;
import java.util.List;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {


    private static List<Integer> CARD_VALUES = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    private static List<String> CARD_SUITS = Arrays.asList("Club", "Diamonds", "Hearts", "Spades");
    
  

    public static List<Integer> getCardValues() {
        return CARD_VALUES;
    }

    public static List<String> getCardSuits() {
        return CARD_SUITS;
    }

}
