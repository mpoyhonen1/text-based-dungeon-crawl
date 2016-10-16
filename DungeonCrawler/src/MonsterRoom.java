// MonsterRoom.java - Description

public class MonsterRoom extends DungeonRoom {
    private static final int MAX_LOOT = 10;
    private int treasure;
    
    public MonsterRoom() {
	super("Monster Room");
	treasure = 1 + (int)(Math.random() * MAX_LOOT);
    }

    @Override
    public void loot() {
	// addLoot if player kills monster
    }
    
}
