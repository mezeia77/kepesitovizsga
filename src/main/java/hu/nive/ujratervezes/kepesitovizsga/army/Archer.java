package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer implements MilitaryUnit{

    private boolean armored = false;
    private int vitality = 50;
    private int damage = 20;


    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        vitality-=damage;
    }
    public int getHitPoints() {
        return vitality;
    }
}
