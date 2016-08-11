package game;

import game.obscwarriors.SubWarriorsI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import warriors.Warrior;
import warriors.units.Arbaletchik;
import warriors.units.Pikiner;
import warriors.units.PikinerGvard;
import warriors.units.Ricar;

import java.util.ArrayList;

/**
 * Created by Shur on 22.06.2016.
 * Цель:
 */
public class Warriors {

    private ArrayList<warriors.Warrior> war = new ArrayList<>();
    private ObservableList<VBox> warItems = FXCollections.observableArrayList();
    private SubWarriors sub;

    public Warriors(int townHallLev){
        sub = new SubWarriors();
        war.add(0, new Pikiner(townHallLev-5, sub));
        warItems.add(0, war.get(0).getImageVB());
        war.add(1, new Arbaletchik(townHallLev-5, sub));
        warItems.add(1, war.get(1).getImageVB());
        war.add(2, new Ricar(townHallLev-5, sub));
        warItems.add(2, war.get(2).getImageVB());
        war.add(3, new PikinerGvard(0, sub));
        warItems.add(3, war.get(3).getImageVB());
    }

    public ArrayList<Warrior> getArrayWarrior(){
        return war;
    }

    public ObservableList<VBox> getWarItems(){
        return warItems;
    }

        public SubWarriors getSub(){
        return sub;
    }

}
