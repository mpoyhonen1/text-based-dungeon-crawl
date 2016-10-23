package crawler;

public abstract class Monster {
	private String name;
	private int health, loot;
	Player player;

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
	
	public boolean monsterDead() {
		if (health <= 0) {
			return true;
		}
		
		return false;
	}

	public abstract int damage();

	public abstract int droppedLoot();
	
	public int getLoot() {
		// return player.setLoot(player.getLoot() + loot);
		return loot;
	}
	
	public String toString() {
		return "\n\t\tMonsterRoom(): " + name + " " + health;
	}

}
