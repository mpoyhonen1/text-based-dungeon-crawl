package crawler;

public abstract class Monster {
	private String name;
	private int health;
	Player player;
	protected int loot;
	
	public Monster(String name) {
		this.name = name;
		this.health = 30;
	}

	public void attack(Player thisPlayer) {
		int damageDealt = this.damage();
		int newHealth = thisPlayer.getHealth();
		newHealth = newHealth - damageDealt;
		System.out.println(this.toString() + " deals you " + damageDealt + " damage. It kinda hurts. You have " 
				+ thisPlayer.getHealth() + " health left.");
		thisPlayer.setHealth(newHealth);		
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int damage) {
		health -= damage();
	}
	

	public abstract int damage();

	public int getLoot() {
		return loot;
	}
	
	public String toString() {
		return "\n\t\tMonsterRoom(): " + name + " " + health;
	}

}
