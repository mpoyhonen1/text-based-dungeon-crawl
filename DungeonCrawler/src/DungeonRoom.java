// DungeonRoom.java - Description...

public abstract class DungeonRoom {
    private String room;
    private int treasure;
    
    public DungeonRoom(String room) {
	this.room = room;
	treasure = 0;
    }
    
    public String getRoom() {
	return room;
    }
    
    public int getLoot() {
	return treasure;
    }
    
    public void addLoot(int treasure) {
	this.treasure = treasure;
    }
    
    public abstract void loot();
}

/*    private ArrayList roomList = new ArrayList();

    public DungeonRoom() {
	for (int i = 0; i < 10; i++) {
	    int tmp = (int)(Math.random() * 2) + 1;
	    
	    switch (tmp) {
	    case 1:
		roomList.add("LootRoom");
		break;
	    case 2:
		roomList.add("MonsterRoom");
		break;
	    default:
		System.out.println("Error.");
		System.exit(0);
	    }
	}
    }
*/
