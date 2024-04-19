/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author michael
 */
public class Deck extends Card{
    

    public int cardValue;
    public String cardSuit;
    
  
    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int randValue) {
        switch (randValue){
            
            case 1:
                this.cardValue = Card.getCardValues().get(0); 
                break;
            case 2:
                this.cardValue = Card.getCardValues().get(1);
                break;
            case 3:
                 this.cardValue = Card.getCardValues().get(2);         
                break;
            case 4:
                 this.cardValue = Card.getCardValues().get(3);     
                break;
            case 5:
                 this.cardValue = Card.getCardValues().get(4);          
                break;
            case 6:
                 this.cardValue = Card.getCardValues().get(5);             
                break;
            case 7:
                 this.cardValue = Card.getCardValues().get(6);     
                break;
            case 8:
                 this.cardValue = Card.getCardValues().get(7);           
                break;
            case 9:
                 this.cardValue = Card.getCardValues().get(8);        
                break;
            default:
                 this.cardValue = Card.getCardValues().get(9);           
                break; 
        }
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(int randSuit) {
        switch (randSuit){
            
            case 1:
                cardSuit = Card.getCardSuits().get(0);   
                break;
            case 2:
                cardSuit = Card.getCardSuits().get(1); 
                break;
            case 3:
                cardSuit = Card.getCardSuits().get(2);              
                break;
            default:
                cardSuit = Card.getCardSuits().get(3);       
                break;
        }
    }
    
}
