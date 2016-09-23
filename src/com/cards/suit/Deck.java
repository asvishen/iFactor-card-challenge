package com.cards.suit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private static final int deckSize = 52;
	private List<Card> deck = new ArrayList<Card>();
	private int currentDeckSize = deckSize;
	public Deck()
	{
		for(int i=0;i<deckSize;i++)
		{
			Suit suit = Suit.getSuitFromVal(i/13);
			deck.add(new Card(i%13,suit));
		}
	}
	
	public void setDeck(ArrayList<Card> deck)
	{
		this.deck = deck;
	}
	
	public void shuffle()
	{
		Random rand = new Random();
		int index;
		Card card;
		for(int i=0;i<deckSize;i++)
		{
			
			index = rand.nextInt(deckSize);
			card = deck.get(i);
			deck.set(i, deck.get(index));
			deck.set(index, card);
		}
	}
	public void cut(int index)
	{
		List<Card> newBottom = new ArrayList<Card>();
		for(int i=0;i<index;i++)
		{
			newBottom.add(deck.remove(i));
		}
		deck.addAll(newBottom);
	}
	
	public Card deal()
	{
		if(currentDeckSize>0)
			{
			currentDeckSize--;
			Card card = deck.remove(0);
			card.markTaken();
			return card;
			}
		else return null;
	}
	
	public Card turnOver()
	{
		return deck.get(0);
	}
	
	public int search(Card card)
	{
		return deck.indexOf(card);
	}
	
	public void newOrder()
	{
		List<Card> newDeck = new ArrayList<Card>();
		for(int i=0;i<deckSize;i++)
		{
			Card card = new Card(i%13,Suit.getSuitFromVal(i/13));
			int index = search(card);
			if(index!=-1)
			{
				newDeck.add(card);
			}
			
		}
		deck.clear();
		deck.addAll(newDeck);
	}
}
