package game;

import game.obsarmy.ObsArmyI;
import game.obsarmy.SubArmyI;
import ui.obsSquare.SubChoice;

/**
 * Created by Shur on 22.06.2016.
 * Название: Игрок
 * Цель:
 * 1) Реализация игрока
 */

public class Player {
    private String name = "";
    private boolean attac = false; // true - атака, false - защита
    private Coordinates coord;
    private Army attackArmy;
    private Castle castle;
//    private Book[] knigi;


    public Player(String name, int townHallLev){
        this.name = name;
        this.castle = new Castle(townHallLev);
        attackArmy = new Army(castle.getWarriors().getSub(), 1);
    }

    //TODO: Пустой конструкторо
    public Player() {

    }

    public void setA(Army army) {
        attackArmy = army;
    }

    public String getName (){
        return name;
    }

    public void setAttac (boolean attac){
        this.attac = attac;
        if (attac = true) {
        }
    }

    public Castle getCastle() {
        return this.castle;
    }

    public ObsArmyI getArmyI(){
        return attackArmy;
    }

    public Army getArmy(){
        return attackArmy;
    }
}
