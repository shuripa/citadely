package ui.obsSquare;

import game.obsarmy.ObsArmyI;
import game.obsarmy.SubArmyI;

import java.util.ArrayList;

/**
 * Created by Shur on 06.08.2016.
 * Цель:
 */
public class SubChoice implements SubSquare, SubArmyI {
    private ArrayList<ObsSquare> obsSquares;
//    private ArrayList<ObsArmyI> obsArmy;
    private ObsArmyI attackArmy;
    private ObsArmyI protectionArmy;

    private boolean isClicked;
    private int activeArmy;
    private int activeColon;

    public SubChoice(){
        isClicked = false;
        obsSquares = new ArrayList<>();
//        obsArmy = new ArrayList<>(2);
    }

    @Override
    public void registerSquare(ObsSquare o) {
        obsSquares.add(o);
    }

    @Override
    public void unRegisterSquare(ObsSquare o) {
        int i = obsSquares.indexOf(o);
        if (i>=0) obsSquares.remove(i);
    }

    @Override
    public void notifySquare(int activeGroup, int activeCell) {
        isClicked = !isClicked;
        if (isClicked){
            this.activeArmy = activeGroup;
            this.activeColon = activeCell;
        } else {
            this.activeArmy = -1;
            this.activeColon = -1;
        }
        for (ObsSquare os: obsSquares) {
            os.update(isClicked);
        }

        notifyArmy(activeGroup);
    }

    @Override
    public void registerArmy(ObsArmyI o, int ind) {
        if (ind == 0)
            protectionArmy  = o;
        else  attackArmy = o;
//        obsArmy.add(ind, o);
//        obsArmy.set(ind, o);
    }

    @Override
    public void unRegisterArmy(ObsArmyI o) {
//        int imageProperty = obsArmy.indexOf(o);
//        if (imageProperty>=0) obsArmy.remove(imageProperty);
    }

    @Override
    public void notifyArmy(int group) {
//        for (ObsArmyI o: obsArmy) {
//            o.update(activeArmy, activeColon);
//        }
        if (group == 0) {
            protectionArmy.update(activeArmy, activeColon);
        } else {
            attackArmy.update(activeArmy, activeColon);
        }
    }
}
