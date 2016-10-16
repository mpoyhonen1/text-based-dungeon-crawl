package cheez;

public abstract class Weapon {
	protected String name;
	protected int attackStrength;
	
	public Weapon(String name) {
		this.name = name;
	}

	public abstract int getAttackStrength();

	public abstract String getAttackText();
	
	public String getName() {
		return this.name;
	}
}
