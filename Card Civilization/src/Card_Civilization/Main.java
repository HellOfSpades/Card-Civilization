package Card_Civilization;

import javax.swing.JFrame;

import Card_Civilization.Board.Map;

public class Main {

	public static void main(String[] args) {
		Player[] players = {new Player(),new Player()};
		Round round = new Round(players,new Map());
	}

}
