package crawler;

public abstract class DungeonRoom {

	public abstract int getLoot();

	public abstract String getName();

	public String toString() {
		return "DungeonRoom()";
	}

	
	public abstract Monster getMonster();
}
