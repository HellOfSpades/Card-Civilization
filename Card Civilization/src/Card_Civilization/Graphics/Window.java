package Card_Civilization.Graphics;

import javax.swing.JFrame;

import Card_Civilization.Round;

public class Window extends JFrame{
	
	private Round round;
	Painter painter;
	
	public Window(int x, int y, int width, int height, Round round){
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);	
		
		setBounds(x,y,width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painter = new Painter(round);
		//setContentPane(painter);
		this.round = round;
		setVisible(true);
		
		
		
	}

}
