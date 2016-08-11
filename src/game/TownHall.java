package game;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class TownHall extends Building {
    private int[] lim;
    private Gate gate;

    public TownHall(int level){
        super(level);
        this.gate = new Gate(level-2);
    }

    public int[] getFunc(){
        switch (super.getLevel()){
            //lim[0] - лимит атаки, lim[1] - лимит защиты
            default: {lim[0] = 0; lim[1] = 0; return lim;}
            case 5: {lim[0] = 200000; lim[1] = 1000000; return lim;}
            case 6: {lim[0] = 400000; lim[1] = 1500000; return lim;}
            case 7: {lim[0] = 600000; lim[1] = 2000000; return lim;}
            case 8: {lim[0] = 800000; lim[1] = 2700000; return lim;}
            case 9: {lim[0] = 1000000; lim[1] = 3100000; return lim;}
            case 10: {lim[0] = 1200000; lim[1] = 3500000; return lim;}
            case 11: {lim[0] = 1400000; lim[1] = 4000000; return lim;}
            case 12: {lim[0] = 1600000; lim[1] = 4500000; return lim;}
            case 13: {lim[0] = 1800000; lim[1] = 5000000; return lim;}
            case 14: {lim[0] = 2000000; lim[1] = 5500000; return lim;}
        }
    }
}
