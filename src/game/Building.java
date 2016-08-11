package game;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public abstract class Building {

    private int level=0;
//    private int[]func;

    public Building(int l){level=l;}

    public int getLevel() {return level;}
    public abstract int[] getFunc();
}

