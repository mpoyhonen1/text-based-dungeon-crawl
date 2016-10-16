// MonsterRoom.java - Description

public abstract class MonsterRoom extends DungeonRoom {
    private static final int MAX_LOOT = 10;
    private int treasure;
    
    public MonsterRoom() {
	treasure = 1 + (int)(Math.random() * MAX_LOOT);
    }

    @Override
    public int getLoot() {
	return treasure;
    }
}
