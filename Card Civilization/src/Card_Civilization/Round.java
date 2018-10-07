package Card_Civilization;

import Card_Civilization.Board.Map;
import Card_Civilization.Graphics.Window;

public class Round {
	private Player[] players;
	private Map map;
	private Window window;
	
	public Round(Player[] players, Map map){
		this.players = players;
		this.map = map;
		this.window = new Window(Standards.XWINDOWPOSITION,Standards.YWINDOWPOSITION,Standards.WINDOWWIDTH,Standards.WINDOWHEIGHT, this);
		
		
	}
	public Player getPlayer(int i) {
		return players[i];
	}
}
