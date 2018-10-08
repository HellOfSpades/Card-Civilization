package Card_Civilization.Cards.types;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Card_Civilization.Cards.Categories.Rank;
import Card_Civilization.Cards.Categories.Rarity;

public class CardUnit extends Card{

	private Rank rank;
	private int power;
	private int coverbonus;
	
	public CardUnit(String Image){
		try {
			image = ImageIO.read(new File(Image));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
