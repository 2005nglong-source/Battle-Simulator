public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

private int getIndex(int n){
	int a = 0, b = 1, c = 1;
    int index = 1;
	while (c < n)
    {
        c = a + b;
        index++;
        a = b;
        b = c;
    }
    return index;
}
	@Override
	public double getCombatScore() {
		int hp = getBaseHp();
		int wp=  getWp(); 
		if(hp!=0 && hp!=1){
		if (Utility.isSquare(hp*hp*5-4)||Utility.isSquare(hp*hp*5+4)) {
			return 1000 + getIndex(hp);
		}
	}
	return hp *3;
}
}
