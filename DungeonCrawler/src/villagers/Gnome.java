package villagers;

public class Gnome extends Villager implements CanDoMagic, CanFarm, CanFight, CanMine {

    public Gnome(String name) {
	super(name);
    }

    @Override
    public int doMagic() {
	int toReturn = 0;

	if (Math.random() > .7) {
	    toReturn = (int) (Math.random() * 6) + 15;
	}
	return toReturn;
    }

    @Override
    public void work() {
    }

    @Override
    public int mine() {
	return 0;
    }

    @Override
    public int fight() {
	// Gnomes have lucky attacks, return 1 - 6
	return ((int) Math.random() * 6) + 1;
    }

    @Override
    public int farm() {
	return 0;
    }

}
