// Dungeon.java - Description...

public class Dungeon {
    private static final int ROOM_LIMIT = 10;
    
    private DungeonRoom[] rooms;
    private int pointer;
    
    // create new array of dungeon rooms
    public Dungeon() {
	rooms = new DungeonRoom[ROOM_LIMIT];
    }
    
    // return a dungeon room
    public DungeonRoom get(int index) {
	return rooms[index];
    }
    
    public DungeonRoom removeRoom(int index) {
	DungeonRoom newRooms = rooms[index];
	
	for (int i = index; i < rooms.length - 1; i++) {
	    rooms[i] = rooms[i + 1];
	}

	pointer--;

	return newRooms;
    }

    public void add(DungeonRoom room) {
	rooms[pointer++] = room;
    }

    public boolean isFull() {
	return (pointer == rooms.length);
    }

    public int size() {
	return pointer;
    }
}
