package game;

/**
 * Created by Shur on 22.06.2016.
 * Название: Палатка
 * Цель:
 */
public class Tent extends Building{
    private int[] protection;

    public Tent(int level){
        super(level);
    }

    public int[] getFunc(){
        switch (super.getLevel()){
            default: {protection[0]=0; return protection;}
            case 1: {protection[0]=5; return protection;}
            case 2: {protection[0]=10; return protection;}
            case 3: {protection[0]=15; return protection;}
            case 4: {protection[0]=20; return protection;}
            case 5: {protection[0]=25; return protection;}
            case 6: {protection[0]=30; return protection;}
            case 7: {protection[0]=35; return protection;}
            case 8: {protection[0]=40; return protection;}
            case 9: {protection[0]=45; return protection;}
            case 10: {protection[0]=50; return protection;}
        }
    }
}
