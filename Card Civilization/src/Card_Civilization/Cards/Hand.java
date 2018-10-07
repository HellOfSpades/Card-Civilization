package Card_Civilization.Cards;

import Card_Civilization.Player;
import Card_Civilization.Cards.types.Card;

public class Hand {
	private Card[] cards = new Card[10];
	private Player player;
	private int size;
	
	public Hand(Player player) {
		this.player = player;
		size = 0;
	}
}
