package warriors.units;

import game.obscwarriors.SubWarriorsI;
import warriors.*;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class Arbaletchik extends Warrior {

    public Arbaletchik(int level, SubWarriorsI sub){
        super (level, "warriors\\units\\Arbaletchik.jpg", "Арбалетчик", sub);
    }

    public WarProp getWP(){
        return new WarProp(Typs.Faction.Order, Typs.Branch.Infantry, Typs.Race.Human, Typs.Pol.Male);
    }

    public WarSup[] getWS(){
        switch (super.getLevel()){
            default: {return getWSsub(12, 18);}
            case 1: {return getWSsub(16, 24);}
            case 2: {return getWSsub(20, 30);}
            case 3: {return getWSsub(24, 36);}
            case 4: {return getWSsub(28, 42);}
            case 5: {return getWSsub(32, 48);}
            case 6: {return getWSsub(36, 54);}
            case 7: {return getWSsub(40, 60);}
            case 8: {return getWSsub(40, 60);}
        }
    }

    private WarSup[] getWSsub(int i, int j){
        WarSup [] warSup = new WarSup[2];
        warSup[0] = new WarSup(Typs.Faction.Mag, Typs.Branch.AnyBranch, Typs.Race.AnyRace, Typs.Pol.AnyPol, Typs.Super.Attack, i);
        warSup[1] = new WarSup(Typs.Faction.AnyFaction, Typs.Branch.Infantry, Typs.Race.AnyRace, Typs.Pol.AnyPol, Typs.Super.Attack, j);
        return warSup;
    }

    public int getAttack(){
        switch (super.getLevel()){
            default: return 37;
            case 1: return 39;
            case 2: return 41;
            case 3: return 43;
            case 4: return 46;
            case 5: return 49;
            case 6: return 52;
            case 7: return 55;
            case 8: return 80;
        }
    }

    public int getProtection(){
        switch (super.getLevel()){
            default: return 135;
            case 1: return 140;
            case 2: return 150;
            case 3: return 155;
            case 4: return 165;
            case 5: return 170;
            case 6: return 180;
            case 7: return 190;
            case 8: return 240;
        }
    }

    @Override
    public WarConstProp getWarConstProp() {
        return new WarConstProp(15, 40, 15);
    }

    @Override
    public void setCount() {

    }

    @Override
    public void setSubWarior() {
        super.getSub().notifyCol(this);
    }

}
