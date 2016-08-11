package game;

import game.obsarmy.ObsArmyI;
import game.obsarmy.SubArmyI;

import java.util.ArrayList;

/**
 * Created by Shur on 27.07.2016.
 * Цель:
 */
public class Castle {
    TownHall townHall;
    Warriors war;
    Army protectionArmy;

    public Castle (int townHallLev){
        this.townHall = new TownHall(townHallLev);
        this.war = new Warriors(townHallLev);
        protectionArmy = new Army(war.getSub(), 0);
    }

    public Warriors getWarriors(){
        return this.war;
    }

    public ObsArmyI getArmyI() {
        return protectionArmy;
    }

    public Army getArmy() {
        return protectionArmy;
    }

}
