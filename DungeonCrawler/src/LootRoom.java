// LootRoom.java - Description...

public class LootRoom extends DungeonRoom {
    private static final int MAX_LOOT = 10;
    private int treasure;
    
    public LootRoom() {
	super("Loot Room");
    }

    @Override
    public void loot() {
	treasure = 1 + (int)(Math.random() * MAX_LOOT);
	addLoot(treasure);
    }

}
