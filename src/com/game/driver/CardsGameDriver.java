package com.game.driver;

import com.cards.suit.Card;
import com.cards.suit.Deck;
import com.cards.suit.Suit;

public class CardsGameDriver {

	public static void main(String[] args) {
		//creates a deck
		Deck deck = new Deck();
		System.out.println("Top of deck "+ deck.turnOver());
		//shuffle
		deck.shuffle();
		System.out.println("Top of deck "+ deck.turnOver());
		
		deck.shuffle();
		System.out.println("Top of deck "+ deck.turnOver());

		deck.newOrder();
		System.out.println("Top of deck before cut"+ deck.turnOver());

		deck.cut(12);
		
		System.out.println("Top of deck after cut"+ deck.turnOver());

		
		System.out.println(deck.search(new Card(3,Suit.CLUB)));
		
		Card card = deck.deal();
		
		System.out.println(card);
		
		card = deck.deal();
		
		System.out.println( card);
	}

}
