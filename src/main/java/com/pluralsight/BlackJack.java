package com.pluralsight;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

            System.out.println(" What is player's 1 name");
            String name1 = nameScanner.nextLine();

            System.out.println(" What is player's 2 name");
            String name2 = nameScanner.nextLine();

        System.out.println("PLayer 1 " + name1);
        System.out.println("PLayer 2 " + name2);


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

        // compare each player, the one closes to 21 wins
        int result = Integer.compare(hand1.getValue(), hand2.getValue());
        if (result == 0) {
            System.out.println("It's tied");
        } else if (result > 0){
            System.out.println("Player 1 wins " + hand1.getValue());
        } else {
            System.out.println("Player 2 wins " + hand2.getValue());
        }
    }

}