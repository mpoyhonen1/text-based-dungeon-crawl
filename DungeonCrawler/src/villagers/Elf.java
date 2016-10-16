package villagers;

public class Elf extends Villager implements CanFarm, CanDoMagic {

    public Elf(String name) {
	super(name);
    }

    @Override
    public void work() {
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
    public int farm() {
	return 0;
    }

}
