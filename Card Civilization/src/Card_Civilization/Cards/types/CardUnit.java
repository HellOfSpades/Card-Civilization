package Card_Civilization.Cards.types;

import Card_Civilization.Cards.Categories.Rank;
import Card_Civilization.Cards.Categories.Rarity;

public abstract class CardUnit extends Card{

	private Rank rank;
	private int power;
	private int coverbonus;
	
	public Rank getRank() {
		return rank;
	}
	public int getPower() {
		return power;
	}
	public int getCoverBonus() {
		return coverbonus;
	}
}
