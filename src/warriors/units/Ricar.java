package warriors.units;

import game.obscwarriors.SubWarriorsI;
import warriors.*;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class Ricar extends Warrior {

    public Ricar(int level, SubWarriorsI sub){
        super (level, "warriors\\units\\Ricar.jpg", "Рыцарь", sub);
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
        warSup[1] = new WarSup(Typs.Faction.AnyFaction, Typs.Branch.Arrows, Typs.Race.AnyRace, Typs.Pol.AnyPol, Typs.Super.Attack, j);
        return warSup;
    }

    public int getAttack(){
        switch (super.getLevel()){
            default: return 140;
            case 1: return 150;
            case 2: return 160;
            case 3: return 170;
            case 4: return 180;
            case 5: return 190;
            case 6: return 200;
            case 7: return 220;
            case 8: return 260; //?
        }
    }

    @Override
    public int getProtection(){
        switch (super.getLevel()){
            default: return 690;
            case 1: return 720;
            case 2: return 760;
            case 3: return 800;
            case 4: return 840;
            case 5: return 890;
            case 6: return 950;
            case 7: return 990;
            case 8: return 1060; //?
        }
    }

    @Override
    public WarConstProp getWarConstProp() {
        return new WarConstProp(45, 130, 45);
    }

    @Override
    public void setCount() {

    }

    @Override
    public void setSubWarior() {
        super.getSub().notifyCol(this);
    }


}
