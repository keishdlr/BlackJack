package com.pluralsight;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {


        public static void players() {
            System.out.println(" What is player's 1 name");
            String Name;

            Scanner nameScanner = new Scanner(System.in);
            String name = nameScanner.nextLine();
        }

        //create the deck
        Deck deck = new Deck();
        //create the hand
        Hand hand1 = new Hand();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }

}