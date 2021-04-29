package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman implements MilitaryUnit{

    private boolean armored;
    private int vitality = 100;
    private int damage = 10;

    private boolean hasShield = true;

    public Swordsman(boolean armored) {
        this.armored = armored;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if(hasShield){
            hasShield = false;
        } else if (armored){
            vitality -=damage/2;
        } else if (!hasShield && !armored){
            vitality -= damage;
        }

    }

    public int getHitPoints() {
        return vitality;
    }
}
