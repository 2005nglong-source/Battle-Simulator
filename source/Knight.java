public class Knight extends Fighter {
    public Knight(int baseHp, int wp) { 
        super(baseHp,wp);
    }

    public double getCombatScore() {
        int hp= getBaseHp(), wp= getWp();
        if (Utility.isSquare(Battle.GROUND)) {
            if(hp*2 >999) return 999;
            else return hp*2 ;
        }
        else {
            if (wp==1) return hp;
            else return hp/10;
        }
    }
}
