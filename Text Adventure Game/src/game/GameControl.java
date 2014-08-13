package game;

import screeens.Game;
import screeens.Game2;

public class GameControl {
	private static Player player = new Player();
	private static Game2 game;
	public static void main(String[] args) {
		createPlayerTestClass();
		
		game = new Game2();
		game.main(args);
		
	}
	
	public void displayText(String text){
		game.addText(text);
	}
	
	public static void modifyAttribute(){
		
	}
	
	private static void createPlayerTestClass(){
		player.setName("Jay");
		player.setHealth(100);
		player.setLevel(1);
		player.setMana(100);
		player.setMaxExp(20);
	}
}
