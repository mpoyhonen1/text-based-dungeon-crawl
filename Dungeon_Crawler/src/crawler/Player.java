package crawler;

/**
 * Class that contains methods for the monster, Crawler. 
 * 
 * @author Mark Poyhonen and Izabel Mohamed
 * 
 * Project 1
 *
 */

import java.util.*;

public class Player {
	private static final int ATTACK_MAX = 35;
	
	private ArrayList roomsExp = new ArrayList();

	private String name;
	private int totalLoot, health;
		
	public Player(String name) {
		this.name = name;
		totalLoot = 0;
		health = 100;
		roomsExp.clear();
	}
	
	public String flee() {
		String toReturn = "";

		int flee = (int) (Math.random() * 2) + 1;

		switch (flee) {
		case 1:
			toReturn = "Flee!";
			break;
		case 2:
			toReturn = "You have chosen to attack!";
			//fight();
			break;
		default:
			System.out.println("Error!");
			break;
		}
		
		return toReturn;
	}

	public int getLoot() {
		return totalLoot;
	}
	
	public void setLoot(int loot) {
		totalLoot = loot;
	}

	public void setHealth(int health) {
		this.health = health;
		checkHealth();
	}

	public int getHealth() {
		return health;
	}

	public void checkHealth() {
		if (health < 1) {
			System.out.println("Oh no. I'm sorry to have to inform you that you appear to have expired. "
					+ "You may want to see someone about that. Good bye.");
			System.exit(0);
		}
	}

	public void attack(Monster thisMonster) {

		int damageDealt = ((int) (Math.random() * ATTACK_MAX) + 3);
		int newHealth = thisMonster.getHealth();
		newHealth = newHealth - damageDealt;
		System.out.println("You deal " + damageDealt + " damage to " + thisMonster + ".");
		thisMonster.setHealth(newHealth);
	}
	
	public void fight(Monster thisMonster) {
		/* Logic is roughly as follows:
		 * 
		 * Inside of a loop that will finish when the player is dead, the monster is dead, or
		 * the player has elected to flee.
		 * 
		 * 		Player attacks Monster
		 * 		Check if Monster is dead, if so, award loot
		 * 		Monster attacks Player
		 * 		Check if Player is dead, if so, taunt their manhood
		 * 
		 * 
		 */
		
		while( getHealth() > 0 && thisMonster.getHealth()  > 0) {
			attack(thisMonster);
			if(thisMonster.getHealth() < 1) {
				System.out.println("Congratulations, you have killed the " + thisMonster 
						+ " and earned " + thisMonster.getLoot() + " loot.");
				setLoot(getLoot() + thisMonster.getLoot());
			} else {
				thisMonster.attack(this);
				checkHealth();

			}
			
 		}
	}

	public void setRoomsExp(DungeonRoom room) {
		roomsExp.add(room);
	}
	
	public int getRooms() {
		return roomsExp.size();
	}

	public String toString() {
		return "\nName: " + name + "\nHealth " + health + "\nLoot " + totalLoot + "\nRooms Explored: " + roomsExp;
	}

}
