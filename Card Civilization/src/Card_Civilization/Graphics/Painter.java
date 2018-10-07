package Card_Civilization.Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Card_Civilization.Round;

public class Painter extends JPanel{
	
	Round round;
	
	Painter(Round round){
		this.round = round;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 =	(Graphics2D)  g;
		
		
		
		g2.drawImage()
	}
}
