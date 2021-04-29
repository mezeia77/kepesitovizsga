package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        militaryUnits.add(militaryUnit);
    }

    public int getArmySize() {
        return militaryUnits.size();
    }

    public int getArmyDamage() {
        int result = 0;
        for(MilitaryUnit mu:militaryUnits){
            result +=mu.doDamage();
        }
        return result;
    }

    public void damageAll(int i) {
        List<MilitaryUnit> temp = new ArrayList<>();
        MilitaryUnit militaryUnit;
        for(MilitaryUnit mu:militaryUnits){

        }
    }
}
