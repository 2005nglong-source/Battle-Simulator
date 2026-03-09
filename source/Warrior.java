public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp,wp);
    }

    public double getCombatScore() {
        int hp=getBaseHp(), wp=getWp();
        if (Utility.isPrime(Battle.GROUND)) {
            if(hp*2 >999) return 999;
            else return hp*2;
        }
        else {
            if (wp==1) return hp;
            else return hp/10;
        }
    }
}
