package crawler;

public class Walker extends Monster {
	private static final int ATTACK_MAX = 10;
	private static final int MAX_LOOT = 45;
	private int damage, loot;

	public Walker() {
		super("Walker");
	}

	public int droppedLoot() {
		// monster died
		if (monsterDead()) {
			loot = (int) (Math.random() * MAX_LOOT) + 3;
			return loot;
		}

		// player died
		loot = 0;
		return 0;
	}

	public int damage() {
		damage = (int) (Math.random() * ATTACK_MAX) + 3;
		return damage;
	}

	public String toString() {
		return "Walker: health=" + getHealth();
	}

}
