package game;

/**
 * Created by Shur on 22.06.2016.
 * Название: Ворота
 * Цель:
 */
public class Gate extends Building{
    private int[] prot; // Защита
    public Gate(int level){
        super(level);
    }
    public int[] getFunc(){
        switch (super.getLevel()){
            default: prot[0]=0; return prot;
            case 1: prot[1]=15; return prot;
            case 2: prot[1]=20; return prot;
            case 3: prot[1]=25; return prot;
            case 4: prot[1]=30; return prot;
            case 5: prot[1]=35; return prot;
            case 6: prot[1]=40; return prot;
            case 7: prot[1]=45; return prot;
            case 8: prot[1]=50; return prot;
            case 9: prot[1]=55; return prot;
            case 10: prot[1]=60; return prot;
        }
    }
}
