package gamestuff;

public class Player {
	private static String name;
	
	private static int health;
	private static int mana;
	private static int maxHealth;
	private static int maxMana;
	private static int experience;
	private static int expNeeded;
	private static int level;
	
	private static boolean isAlive = true;
	private static boolean levelIncrease = false;
	
	
	public static void setName(String newName){
		name = newName;
	}
	public static String getName(){
		return name;
	}
	
	public static int getLevel(){
		return level;
	}
	public static void setLevel(int newLevel){
		level = newLevel;
	}
	
	public static void setHealth(int newHealth){
		health = newHealth;
	}
	public static int getHealth(){
		return health;
	}
	public static int getMaxHealth(){
		return maxHealth;
	}
	public static void modifyHealth(int change){
		int newHealth = modifyStat(health, maxHealth, change);
		if(newHealth == -1){
			health = maxHealth;
		}if(newHealth <= 0){
			health = newHealth;
			isAlive = false;
		}else{
			health = newHealth;
		}
		GameControl.updateGUI();
		System.out.println("We should have updated the GUI");
	}
	
	public static void setMana(int newMana){
		mana = newMana;
	}
	public static int getMana(){
		return mana;
	}
	public static int getMaxMana(){
		return maxMana;
	}
	public static void modifyMana(int change){
		int newMana = modifyStat(mana, maxMana, change);
		if(newMana == -1){
			mana = newMana;
		}if(newMana <= 0){
			mana = 0;
		}else{
			mana = newMana;
		}
		GameControl.updateGUI();
		System.out.println("We should have updated the GUI");
		
	}
	
	public static void setMaxExp(int exp){
		expNeeded = exp;
	}
	public static int getExp(){
		return experience;
	}
	public static int getExpNeeded(){
		return expNeeded;
	}
	public static void modifyExp(int change){
		int newExp = modifyStat(experience, expNeeded, change);
		if(newExp == -1){
			experience = experience + change - expNeeded;
		}if(newExp <= 0){
			experience = 0;
		}else{
			experience = newExp;
		}
		GameControl.updateGUI();
	}
	
	
	private static int modifyStat(int current, int max, int change){
		int tempStat = current + change;
		if(tempStat > max)
			tempStat = -1;
		return tempStat;
	}


}
