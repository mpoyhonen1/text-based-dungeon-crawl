package crawler;

public class BigBoy extends Monster {
	private static final int ATTACK_MAX = 20;
	private static final int MAX_LOOT = 70;
	private int damage;

	public BigBoy() {
		super("BigBoy");
		loot = (int) (Math.random() * MAX_LOOT) + 20;
		
	}

	public int damage() {
		damage = (int) (Math.random() * ATTACK_MAX) + 20;
		return damage;
	}

	public String toString() {
		return "BigBoy: health=" + getHealth();
	}

}
