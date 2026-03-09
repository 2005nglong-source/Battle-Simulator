public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	public double getCombatScore() {
		return getMana().getMagnitude();
	}
}
