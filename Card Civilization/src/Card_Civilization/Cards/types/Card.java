package Card_Civilization.Cards.types;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import Card_Civilization.Cards.Categories.Rank;
import Card_Civilization.Cards.Categories.Rarity;

public abstract class Card {
	private Rarity rarity;
	private String name;
	private String text;
	private BufferedImage image;
	
	Card(){
		image = ImageIO.read(new File());
	}
	
	public Rarity getRarity() {
		return rarity;
	}
	public String getName() {
		return name;
	}
	public String getText() {
		return text;
	}
}
