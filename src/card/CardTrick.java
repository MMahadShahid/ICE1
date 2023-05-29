/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier   Muhammad Mahad
 * @StudentID 991719124
 * @date May 26 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3 + 0)]);
            magicHand[i] = c; // save the generated cards
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 13: ");

        int userNum = sc.nextInt();  // prompt user for card value
        
        System.out.println("Enter the card: ");
        String userSuit = sc.next(); // prompt user for suit
        System.out.println("Your card: " + userSuit + " " + userNum );
        sc.close(); // ends the scanner
        for (Card s : magicHand){
            if (s.getValue() == userNum && s.getSuit().equalsIgnoreCase(userSuit)){ // checks if cards match
                System.out.println("Congrats! You Won!! :)");// Reports the result
                break;
            }else{
                 System.out.println("Try again next time.. :(");
                 break;
            }// else                
        }// for              
    }//main 
}// Card Trick