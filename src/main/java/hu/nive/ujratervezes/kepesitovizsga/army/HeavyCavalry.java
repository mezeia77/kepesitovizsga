package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry implements MilitaryUnit{

    private boolean armored = true;
    private int vitality = 150;
    private int damage = 20;

    private int noOfAttack = 0;

    @Override
    public int doDamage() {
        if(noOfAttack == 0){
            noOfAttack++;
            return 3*damage;
        }
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        vitality-=damage/2;
    }

    public int getHitPoints() {
        return vitality;
    }
}
