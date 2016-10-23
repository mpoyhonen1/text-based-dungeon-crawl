package crawler;

public class LootRoom extends DungeonRoom {
	private static final int MAX_LOOT = 15;
	private static final int BREAD = 15;
	
	private Player player;
	private int loot;

	public LootRoom() {
		loot = (int) (Math.random() * MAX_LOOT) + 1;
	}

	public void bread() {
		player.setHealth(player.getHealth() + BREAD);
	}

	@Override
	public int getLoot() {
		return loot;
	}

	@Override
	public String getName() {
		return "LootRoom()";
	}
	

	public Monster getMonster() {
		return null;
	}
	
	public String toString() {
		return "\n\t\tLootRoom()";
	}

}
