package crawler;

public class MonsterRoom extends DungeonRoom {
	Monster monster;

	public MonsterRoom() {
		int spawnMonster = (int) (Math.random() * 3) + 1;

		switch (spawnMonster) {
		case 1:
			monster = new Crawler();
			break;
		case 2:
			monster = new Walker();
			break;
		case 3:
			monster = new BigBoy();
			break;
		default:
			System.out.println("Error.");
			break;
		}
		
	}

	@Override
	public int getLoot() {
		// return player.setLoot(player.getLoot() + loot);
		return monster.getLoot();
	}

	@Override
	public String getName() {
		return "This is a monster room. There is a " +  monster + " here.";
	}

	public Monster getMonster() {
		// TODO Auto-generated method stub
		return monster;
	}

}
