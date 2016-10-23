package crawler;

import java.util.Scanner;

public class DungeonDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter player name: ");
		String playerName = keyboard.nextLine();
		//String playerName = "Mark";
		Player player = new Player(playerName);
		System.out.println("Welcome " + player);

		int command;

		System.out.println("Welcome to Text Dungeon ");
		System.out.println("1) Enter the game");
		System.out.println("2) Save Game");  
		System.out.println("3) Show High Score");
		System.out.println("0) Exit Game");

		do {
			command = keyboard.nextInt();
			command = 1;
			
			// user entry
			switch (command) {
			case 1:		// 1) Enter the game
				System.out.println(player + " enters gameLoop()");
				gameLoop(player);
				break;
			case 2:
				break;
			case 3:
				break;
			case 0:
				System.out.println("Game Over");
				break;
			default:
				break;
			}
			
		} while (command != 0);

		keyboard.close();
	}

	// runs game until death or win
	public static void gameLoop(Player player) {
		// Setup and Initialization
		
		Dungeon dungeon = new Dungeon();
		dungeon.init();
		
		DungeonRoom[] rooms = dungeon.getRooms();
		
		int currentRoomIndex = 0;
		
		// actual game loop
		
		while ( currentRoomIndex < rooms.length) {
			DungeonRoom currentRoom = rooms[currentRoomIndex];
			currentRoomIndex++;
			System.out.println("You are in room #"+ currentRoomIndex);
			
			Monster thisMonster = currentRoom.getMonster();
			if(thisMonster != null ){
				player.fight(thisMonster);
				//Deal with loot after fighting with monster
				
			}
			
		}

		System.exit(0);
		
	}

}

/*
 * int setting = (int) (Math.random() * 3) + 1;
 * 
 * switch (monster.getName()) { case "Crawler":
 * System.out.println("In the dark cave, you have wondered around aimlessly.");
 * System.out.
 * println("Slowly, you have moved a long the walls, twisting and turning.");
 * System.out.println("Now, tired you have stopped to catch your breath...");
 * System.out.println("\"Ha~\"\"Ha\"~\"ha\"~"); System.out.println("\"ha\"...");
 * System.out.println("..."); System.out.println("...");
 * System.out.println("..."); System.out.println("*he...!");
 * System.out.println("In the quite you hear other breathing besides yor own.");
 * System.out.
 * println("Your eyes take a while to adjust but you see it a Crawler!");
 * System.out.println("You have walked in to the Crawlers den!");
 * System.out.println(""); System.out.println(
 * "Crawlers are a low level homunculus. They do not have the ability to walk, leaving them fairly week."
 * ); System.out.println("This Crawler has a health of " + monster.getLoot() +
 * "and attack strength of " + monster.Damage());
 * System.out.println("Are you going to fight or flee?");
 * 
 * System.out.println("Enter:"); System.out.println("1) fight");
 * System.out.println("2) flee"); int chose = keyboard.nextInt();
 * keyboard.nextLine();
 * 
 * 
 * switch (chose) { case 1: break; case 2: break; }
 * 
 * 
 * System.out.println("..."); System.out.println("...");
 * 
 * break;
 * 
 * case "Bigboy": System.out.
 * println("In the dark cave, you have chosen to move through the center.");
 * System.out.
 * println("You have made it deap within the cave, braving the dark and cold.");
 * System.out.
 * println("A passage has appeared before you, and you have taken it.");
 * System.out.println("");
 * System.out.println("Bold choice you might regret soon:");
 * System.out.println("..."); System.out.println("...");
 * System.out.println("...");
 * System.out.println("In front of you stands tall a Bigboy!"); System.out
 * .println("Bigboy's are the strongest, opponents you might have to encounter here."
 * ); System.out.
 * println("They are so thick that little damage can be done at once.");
 * System.out.println("And they hit hard in return..."); System.out.println("");
 * 
 * System.out.println("This Crawler has a health of " + monster.getLoot() +
 * "and attack strength of " + monster.Damage());
 * System.out.println("What will you do fight or flee?");
 * 
 * System.out.println("Enter:"); System.out.println("1) fight");
 * System.out.println("2) flee"); chose = keyboard.nextInt();
 * keyboard.nextLine();
 * 
 * switch (chose) { case 1: break; case 2: break; } break;
 * 
 * case "Walker":
 * System.out.println("In the dark cave, you followed the sound of the water.");
 * System.out.
 * println("Slowly, it has brought you in to the under workings of the cave.");
 * System.out.
 * println("You have found an aquifer pool, that is not all however,...");
 * System.out.println("In the water you have spotted a Walker!"); System.out.
 * println("Walker's are agile humunculi, they do medium amount of damage. ");
 * System.out.println("...");
 * 
 * System.out.println("This Crawler has a health of " + monster.getLoot() +
 * "and attack strength of " + monster.Damage());
 * System.out.println("Will you try to face them or will you run away?");
 * 
 * System.out.println("Enter:"); System.out.println("1) fight");
 * System.out.println("2) flee"); chose = keyboard.nextInt();
 * keyboard.nextLine();
 * 
 * switch (chose) { case 1: break; case 2: break; } } else
 * if(dungeon.equals("lootRoom")) {
 * System.out.println("While walking you have found "+dungeon.getLoot()
 * +" of loot and a peice of bread" ); }
 * 
 * } }System.out.println("You have been murderd! ");System.out.
 * println("Your score is "+player.score());break;
 * 
 * }
 * 
 * }
 */