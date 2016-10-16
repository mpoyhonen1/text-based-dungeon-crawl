package villagers;

import java.util.Scanner;

public class RunVillage {

    public static void main(String[] args) {
	Village village = new Village();
	Scanner keyboard = new Scanner(System.in);

	int command;

	do {
	    command = getUserCommandFromMenu(keyboard);
	    switch (command) {
	    case 1:
		if (village.isFull()) {
		    System.out.println("The village is full, please murder a villager first.");
		    break;
		}

		System.out.println("What type of villager would you like to add?");
		System.out.println("1) Human");
		System.out.println("2) Dwarf");
		System.out.println("3) Elf");
		System.out.println("4) Gnome");

		int newVillagerType = keyboard.nextInt();
		keyboard.nextLine();

		System.out.println("What is the name of the new villager? ");
		String villagerName = keyboard.nextLine();

		Villager theNewVillager = null;
		switch (newVillagerType) {
		case 1:
		    theNewVillager = new Human(villagerName);
		    break;
		case 2:
		    theNewVillager = new Dwarf(villagerName);
		    break;
		case 3:
		    theNewVillager = new Elf(villagerName);
		    break;
		case 4:
		    theNewVillager = new Gnome(villagerName);
		    break;
		default:
		    break;
		}

		village.add(theNewVillager);
		break;
	    case 2:
		System.out.println("Please enter the inde of teh villager to banish!");
		int removeVillager = keyboard.nextInt();
		village.removeVillager(removeVillager);
		System.out.println("The villager 1has been banished!");
		break;
	    case 3:
		village.makeAllVillagesWork();
		System.out.println("Joy, all of the villagers worked and now the village has " + village.getTotalMoney()
			+ " money.");
		break;
	    case 4:
		int attackStrength = village.getAttackStrength();
		if (attackStrength > 50) {
		    System.out.println("We destroyed the heathens at the door!!!!");
		} else {
		    System.out.println("Tears and fears, we were ");
		}
		break;
	    case 0:
		System.out.println("With impressive flames, the village burns down.");
	    default:
		break;
	    }
	} while (command != 0);
    }

    private static int getUserCommandFromMenu(Scanner keyboard) {
	int command;
	System.out.println("Enter a command:");
	System.out.println("1) Add villager");
	System.out.println("2) Banish villager");
	System.out.println("3) Make villagers work");
	System.out.println("4) Attack nearby village");
	System.out.println("0) Burn the village to the ground and exit.");

	command = keyboard.nextInt();
	keyboard.nextLine();
	return command;
    }

}
