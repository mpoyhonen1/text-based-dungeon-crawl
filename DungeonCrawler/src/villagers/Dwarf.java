package villagers;

public class Dwarf extends Villager implements CanFight, CanMine {

    public Dwarf(String name) {
	super(name);
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
	return 0;
    }

}
