package game;

import game.obsarmy.ObsArmyI;
import game.obsarmy.SubArmyI;
import game.obscwarriors.ObsWarriorsI;
import game.obscwarriors.SubWarriorsI;
import warriors.Warrior;

import java.util.ArrayList;

/**
 * Created by Shur on 07.08.2016.
 * Цель:
 */

public class SubWarriors implements SubWarriorsI{
//    private ArrayList<ObsWarriorsI> obsWar;
    private ObsWarriorsI regColon;

    public SubWarriors(){
 //       obsWar = new ArrayList<>();
    }

    @Override
    public void registerCol(ObsWarriorsI o) {
 //       obsWar.add(o);
        regColon = o;
    }

    @Override
    public void unRegisterCol(ObsWarriorsI o) {
//        int i = obsWar.indexOf(o);
//        if (i>=0) obsWar.remove(i);
        regColon = null;
    }

    @Override
    public void notifyCol(Warrior warrior) {
//        for (ObsWarriorsI o: obsWar) {
//            o.update(warrior);
//        }
        regColon.update(warrior);
    }


}
