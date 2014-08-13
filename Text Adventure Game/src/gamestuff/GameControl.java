package gamestuff;

import screens.Game;
import screens.Game2;

public class GameControl {
	private static Player player = new Player();
	private static Game game;
	public static void main(String[] args) {
		createPlayerTestClass();
		
		game = new Game();
		game.main(args);
		
		
	}
	
	public void displayText(String text){
		game.addText(text);
	}
	
	public static void updateGUI(){
		game.updateBars(
				player.getHealth(), 
				player.getMana(), 
				player.getExp()
		);
	}
	
	private static void createPlayerTestClass(){
		player.setName("Jay");
		player.setHealth(100);
		player.setLevel(1);
		player.setMana(100);
		player.setMaxExp(20);
	}
}
