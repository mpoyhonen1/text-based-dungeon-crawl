// MonsterRoom.java - Description

public abstract class MonsterRoom {
    protected String name;
	
	public MonsterRoom(String name) {
        this.name = name;
	}

	public abstract String getRoom();

	public abstract String lootRoom();

	public abstract String monsterRoom();
	
}
