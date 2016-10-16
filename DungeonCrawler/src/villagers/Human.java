package villagers;

public class Human extends Villager implements CanFight, CanFarm {

    private static final int ATTACK_STRENGTH = 8;

    public Human(String name) {
	super(name);
    }

    @Override
    public void work() {
	this.addMoney(this.farm());

    }

    @Override
    public int farm() {
	return CanFarm.FARMING_MONEY;
    }

    @Override
    public int fight() {
	return Human.ATTACK_STRENGTH;
    }

}
