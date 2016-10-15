/*
 *  DungeonDriver.java - Description...
 */


public class DungeonDriver {

    public static void main(String[] args) {
        Player BigPapa = new Player("BigPapa");

        Weapon weapon;

        int cmd = 0;

        switch (command) {
            case 1:
                weapon = new Dagger();
                break;
            default:
                System.out.println("Error.");
                break;
        }

        BigPapa.setWeapon(weapon);

        System.out.println(BigPapa.attack());
        System.out.println("BigPapa dealt " + BigPapa.getDamageDealt() + " damage");
        System.out.println(BigPapa.chuckWeapon());
    }

}
