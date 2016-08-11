package game;

import game.obsarmy.ObsArmyI;
import game.obsarmy.SubArmyI;
import game.obscwarriors.SubWarriorsI;

import java.util.ArrayList;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class Army implements ObsArmyI{

    private Colon[] colons = new Colon[4];
    private int armyNum; //Номер армии

    //TODO: Книги не тут должны быть
    private ArrayList<Book> books;

    public Army(SubWarriorsI subW, int armyNum){
        this.armyNum = armyNum;
        colons[0] = new Colon(subW);
        colons[1] = new Colon(subW);
        colons[2] = new Colon(subW);
        colons[3] = new Colon(subW);
    }

    public Colon getColon(int index){
        return colons[index];
    }

    @Override
    public void update(int army, int col) {
        // это условие не допускает уничтожения зарегистрированных колон при параметрах -1, -1
        // разобраться когда появляются эти параметры и что с ними делать.
        // TODO: разобраться с параметрами -1, -1
        if (army >= 0) {
//            for (int i = 0; i < 4; i++) {
//                if (colons[i].isRegister()) colons[i].unRegisterCol();
//            }


            if ((army == armyNum)) {
                colons[col].registerCol();
            }
        }
    }
}
