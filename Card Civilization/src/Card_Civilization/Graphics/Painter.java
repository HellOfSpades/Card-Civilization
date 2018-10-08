package Card_Civilization.Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

import Card_Civilization.Round;
import Card_Civilization.Cards.types.CardUnit;

public class Painter extends JPanel{
	
	Round round;
	
	Painter(Round round){
		this.round = round;
	}
	
	public void paintComponent(Graphics g) {
		System.out.println("painter");
		Graphics2D g2 =	(Graphics2D)  g;
		
		
		
		g2.drawImage(new CardUnit("images/cards/download.png").getImage(),0,0,null);
	}
}
