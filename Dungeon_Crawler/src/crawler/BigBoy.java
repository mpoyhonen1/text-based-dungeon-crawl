package crawler;

public class BigBoy extends Monster {
	private static final int ATTACK_MAX = 20;
	private static final int MAX_LOOT = 70;
	private int damage, loot;

	public BigBoy() {
		super("BigBoy");
	}

	public int droppedLoot() {
		// monster died
		if (monsterDead()) {
			loot = (int) (Math.random() * MAX_LOOT) + 20;
			return loot;
		}

		// player died
		loot = 0;
		return loot;
	}

	public int damage() {
		damage = (int) (Math.random() * ATTACK_MAX) + 20;
		return damage;
	}

	public String toString() {
		return "BigBoy: health=" + getHealth();
	}

}
