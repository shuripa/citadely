package warriors.units;

import game.obscwarriors.SubWarriorsI;
import warriors.*;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class PikinerGvard extends Warrior {

    public PikinerGvard(int level, SubWarriorsI sub){
        super (level, "warriors\\units\\Pikiner.jpg", "Пик.-Гвард.", sub);
    }



    public WarProp getWP(){
        return new WarProp(Typs.Faction.Order, Typs.Branch.Infantry, Typs.Race.Human, Typs.Pol.Male);
    }

    public WarSup[] getWS(){
        switch (super.getLevel()){
            default: {return getWSsub(50, 70);}
            case 1: {return getWSsub(50, 70);}
        }
    }

    private WarSup[] getWSsub(int i, int j){
        WarSup [] warSup = new WarSup[2];
        warSup[0] = new WarSup(Typs.Faction.Mag, Typs.Branch.AnyBranch, Typs.Race.AnyRace, Typs.Pol.AnyPol, Typs.Super.Attack, i);
        warSup[1] = new WarSup(Typs.Faction.AnyFaction, Typs.Branch.Cavalery, Typs.Race.AnyRace, Typs.Pol.AnyPol, Typs.Super.Attack, j);
        return warSup;
    }

    public int getAttack(){
        switch (super.getLevel()){
            default: return 60;
            case 1: return 80; //?
        }
    }

    @Override
    public int getProtection(){
        switch (super.getLevel()){
            default: return 205;
            case 1: return 240;
        }
    }

    @Override
    public WarConstProp getWarConstProp() {
        return new WarConstProp(10, 30, 10);
    }

    @Override
    public void setCount() {

    }

    @Override
    public void setSubWarior() {
        super.getSub().notifyCol(this);
    }

}
