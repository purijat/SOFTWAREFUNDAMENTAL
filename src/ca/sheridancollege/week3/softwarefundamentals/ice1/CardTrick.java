/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Jatin Puri
 * Student id:991549121
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.print("enter num :");
        int value=input1.nextInt();
        System.out.print("enter suit :");
        String usersuit=input2.nextLine();
        Card[] magicHand = new Card[7];
        String cardSuit="";
        String cardRank="";
         int r=0;
         int s;
        
                
        for (int i=0; i<magicHand.length; i++)
        {
          r =(int)(Math.random()*13+1);
            
     switch (r) {
        case 1:
            cardRank = "Ace";
            break;
        case 2:
            cardRank = "2";
            break;
        case 3:
            cardRank = "3";
            break;
        case 4:
            cardRank = "4";
            break;

            case 5:
            cardRank = "5";
            break;          
        case 6:
            cardRank = "6";
            break;
        case 7:
            cardRank = "7";
            break;
        case 8:
            cardRank = "8";
            break;
        case 9:
            cardRank = "9";
            break;
        case 10:
            cardRank = "10";
            break;
        case 11:
            cardRank = "Jack";
            break;
        case 12:
            cardRank = "Queen";
            break;          
        default:
            cardRank = "King";
            break;
        }
        
        
        s = (int)(Math.random()*4);
        switch (s) {
        case 1:
            cardSuit = "Clubs";
            break;
        case 2:
            cardSuit = "Diamonds";
            break;
        case 3:
            cardSuit = "Hearts";
            break;
        default:
            cardSuit = "Spades";
            break;
        }
            Card c = new Card();
            c.setValue(r);
            c.setSuit(cardSuit);
            System.out.println(c);
        }
        
        if(value==r && usersuit==cardSuit){
            System.out.println("yiu won");
        }
        else{
            System.out.println("you lose");
        }
            
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
