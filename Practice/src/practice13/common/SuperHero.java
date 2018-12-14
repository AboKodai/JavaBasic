package practice13.common;

public class SuperHero extends practice13.common.Hero{
	private Item equipment;

	public SuperHero(int hp, int pow, int end) {
		super(hp,pow,end);
	}

	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}

	public Item getEquipment() {
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}



}
