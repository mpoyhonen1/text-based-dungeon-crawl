// Player.java - Description..

import java.util.*;

public class Player {
    private String name;
    private int totalLoot;
    private ArrayList roomsExp = new ArrayList();

    public Player(String name) {
        this.name = name;
        totalLoot = 100;
        roomsExp.clear();
    }

    // Loot
    public void setLoot(int loot) {
        this.totalLoot = loot;
    }

    public int getLoot() {
        return totalLoot;
    }

    // Rooms Explored
    public void setRoomsExp(DungeonRoom room) {
        roomsExp.add(room);
    }

    public String toString() {
        return "\nName: " + name + "\nHealth/Loot: " + totalLoot + "\nRooms Explored: " + roomsExp;
    }

}
