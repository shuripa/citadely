package warriors;

import javafx.beans.property.Property;

/**
 * Created by Shur on 23.06.2016.
 * Цель:
 */
public class WarConstProp {

    private int Attack;
    private int Protection;
    private int Spirit;


    public WarConstProp (int costAttack, int costProtection, int spirit){
        this.Attack = costAttack;
        this.Protection = costProtection;
        this.Spirit = spirit;
    }
    public int getAttack(){
        return Attack;
    }
    public int getProtection() {
        return Protection;
    }
    public int getSpirit() {
        return Spirit;
    }

}
