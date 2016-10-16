import java.util.ArrayList;

// DungeonRoom.java - Description...

public abstract class DungeonRoom {
    private ArrayList roomList = new ArrayList();

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

    public abstract int getLoot();

}
