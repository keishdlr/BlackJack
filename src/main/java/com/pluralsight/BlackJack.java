package com.pluralsight;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class BlackJack {
    Scanner nameScanner = new Scanner(System.in);
    public static void main(String[] args) {


        public static void players() {
            System.out.println(" What is player's 1 name");

            String name1 = Scanner.nextLine();
            String name2 = Scanner.nextLine();
        }

        //create the deck
        Deck deck = new Deck();
        //create the hand
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        // deal 2 cards from the deck and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }
        // repeats for hand 2
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand2.deal(card);
        }

        //print out the value of all the cards in both hands
        System.out.println("This hand is worth " + hand1.getValue());
        System.out.println("This hand is worth " + hand2.getValue());
    }

}