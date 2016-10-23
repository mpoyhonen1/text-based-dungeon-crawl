package crawler;

public class Crawler extends Monster {
	private static final int ATTACK_MAX = 5;
	private static final int MAX_LOOT = 20;
	private int damage;

	public Crawler() {
		super("Crawler");
		loot = (int) (Math.random() * MAX_LOOT) + 5;
	}


	public int damage() {
		damage = (int) (Math.random() * ATTACK_MAX) + 1;
		return damage;
	}

	public String toString() {
		return "Crawler: health=" + getHealth();
	}


}
