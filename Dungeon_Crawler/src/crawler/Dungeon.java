package crawler;

public class Dungeon {
	private DungeonRoom[] rooms;

	public void init() {
		rooms = new DungeonRoom[10];

		for (int i = 0; i < 10; i++) {
			int tmp = (int) (Math.random() * 2) + 1;

			switch (tmp) {
			case 1:
				rooms[i] = new LootRoom();
				break;
			case 2:
				rooms[i] = new MonsterRoom();
				break;
			default:
				System.out.println("Error.");
				System.exit(0);
			}

		}

	}

	public DungeonRoom[] getRooms() {
		return rooms;
	}

	public String toString() {
		return rooms.toString();
	}

}
