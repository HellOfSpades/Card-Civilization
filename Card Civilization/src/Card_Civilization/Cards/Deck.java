package Card_Civilization.Cards;

import java.util.ArrayList;
import java.util.Arrays;

import Card_Civilization.Cards.types.Card;

public class Deck {
	ArrayList<Card> cards;
	
	public Deck(Card[] cards){
		this.cards  = new ArrayList<Card>(Arrays.asList(cards));
	}
}
