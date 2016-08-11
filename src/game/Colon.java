package game;

import game.obscwarriors.ObsWarriorsI;
import game.obscwarriors.SubWarriorsI;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;
import warriors.Warrior;

/**
 * Created by Shur on 22.06.2016.
 * Название: колона
 * Цель:
 */
public class Colon implements ObsWarriorsI {
    private warriors.Warrior warrior;
    private int count; //Количество
    private SubWarriorsI sub; // источник событий выбора войск
    private boolean reg;
    public Property<Image> imageProperty;
    public Property<String> propAttack = new SimpleStringProperty();
    public Property<String> propProtection = new SimpleStringProperty();
    public Property<String> propSpirit = new SimpleStringProperty();


    //TODO: Это не тут создать новый объект Place и разместить его в Castle
    private Tent tent;
    private Gun push1;
    private Gun push2;
    private Gun push3;

    public Colon(SubWarriorsI sub){
        count =0;
        this.sub = sub;
        imageProperty = new SimpleObjectProperty<Image>();
    }

    public void setWarrior(Warrior war) {
        warrior = war;
    }

    public void registerCol(){
        sub.registerCol(this);
        reg = true;
        //TODO: СООБЩЕНИЕ: Колона зарегистрирована.
        System.out.println("Колона зарегистрирована");
    }

    public void unRegisterCol(){
        sub.unRegisterCol(this);
        reg = false;
    }

    public boolean isRegister(){
        return reg;
    }

    public Warrior getWarrior (){
        return warrior;
    }

    @Override
    public void update(Warrior warrior) {
        this.warrior = warrior;
        System.out.println("В колону установлен " + warrior.getName());
        imageProperty.setValue(warrior.imageProperty.getValue());
        propAttack.setValue("" + warrior.getAttack());
        propProtection.setValue("" + warrior.getWarConstProp().getProtection());
        propSpirit.setValue("" + warrior.getWarConstProp().getSpirit());
    }
}
