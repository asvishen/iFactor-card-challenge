package com.cards.suit;

public class Card {
	private boolean isTaken = false;
	
	protected int faceVal;
	protected Suit suit;
	
	public Card(int val,Suit suit)
	{
		faceVal = val;
		this.suit = suit;
	}
	
	public boolean isTaken(){return isTaken;}
	public void markTaken(){isTaken = true;}
	public void markAvailable(){isTaken = false;}
	
	@Override
	public boolean equals(Object ob)
	{
		if(this == ob) return true;
		
		if(ob == null) return false;
		
		if(getClass() != ob.getClass())return false;
		
		Card card = (Card) ob;
		
		return faceVal==card.faceVal && suit==card.suit;
	}
	@Override
	public String toString()
	{
		return suit.toString() + " " + faceVal;
	}

}
	