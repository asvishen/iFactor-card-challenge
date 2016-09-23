package com.cards.suit;

public enum Suit {
	DIAMOND(2),HEART(0),SPADE(3),CLUB(1);
	private int val;
	private Suit(int v){val=v;}
	public int getVal(){return val;}
	
	public static Suit getSuitFromVal(int value)
	{
		Suit suit;
		switch(value)
		{
		case 0: suit= HEART;break;
		case 1: suit=CLUB;break;
		case 2: suit= DIAMOND;break;
		case 3: suit= SPADE;break;
		default: return null;
		}
		return suit;
	}
}
