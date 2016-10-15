
public abstract class DungeonRoom {
    protected String name;
	
	public DungeonRoom(String name) {
        this.name = name;
	}

	public abstract String getRoom();

	public abstract String lootRoom();

	public abstract String monsterRoom();
	
}
