// Player.java - Description..

import java.util.*;

public class Player {
    private String name;
    private int loot;
    private int health;
    private ArrayList roomsExp = new ArrayList();

    public Player(String name) {
        this.name = name;
        loot = 0;
        health = 100;
        roomsExp.clear();
    }

    // Loot
    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int getLoot() {
        return loot;
    }

    // Health
    public void setHealth(int health) {
        this.health = health;
        checkHealth();
    }

    public int getHealth() {
        return health;
    }
    
    public void checkHealth() {
        if (health <= 0) {
            // gameOver()
            System.exit();
        }
    }

    // Rooms Explored
    public void setRoomsExp(String room) {
        roomsExp.add(room);
    }

    public String toString() {
        return "\nName: " + name + "\nHealth: " + health + "\nLoot: " + loot + "\nRooms Explored: " + roomsExp;
    }

}

