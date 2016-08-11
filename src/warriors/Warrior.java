package warriors;

import game.obscwarriors.SubWarriorsI;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * Created by Shur on 22.06.2016.
 * Название: Воин
 * Цель:
 */
abstract public class Warrior extends VBox{
    private int level;

    private WarConstProp wcp;   //Свойства
    private WarProp wp;         //Принадлежность
    private WarSup[] ws;        //Превосходство
    private int attack;         //Атака
    private int protection;     //Защита
    private int count;          //Количество
    private String image;
    private String name;
    private SubWarriorsI sub;

    public Property<Image> imageProperty;

    Label l;                    //метка
    Text t;                     //текст
    Image im;                    //картинка
    ImageView view;             //просмотрщик картинки
    VBox vb;                    //контейнер
    Reflection r;               //Эффект



    public Warrior (int level, String image, String name, SubWarriorsI sub){
        this.ws = getWS();
        this.wp = getWP();
        this.level = level;
        this.wcp = getWarConstProp();
        this.attack = this.getAttack();
        this.protection = this.getProtection();
        this.name = name;
        this.sub = sub;
        r = new Reflection();
        r.setFraction(1.0);

        l = new Label(name);
        l.setEffect(r);

        im = new Image(image);

        imageProperty = new SimpleObjectProperty<>(new Image(image));

        view = new ImageView(imageProperty.getValue());
        view.fitHeightProperty().setValue(80);
        view.preserveRatioProperty().setValue(true);
        this.getChildren().addAll(view, l);

        //TODO: пока сохраняю прежнюю реализацию в комментарии. Потом удалить.
        //vb = new VBox(view, l);

        this.addEventHandler(MouseEvent.MOUSE_RELEASED, t->{
            //TODO: реализовать нажатие кнопки
            //TODO: 1) установить бойца в колону
            //TODO: 2) установить рисунок бойца в гриде

            //TODO: Войско получено нужно передать его слушателю
            // проверено, событие работает
            //l.setText("selected");
            System.out.println("Войско получено.");
            setSubWarior();
        });

    }

    public int getLevel(){return level;}
    public WarProp getWariorProperty(){return wp;}

    public abstract WarProp getWP();
    public abstract WarSup[] getWS();
    public abstract WarConstProp getWarConstProp();

    public abstract int getAttack();
    public abstract int getProtection();

    public abstract void setCount();
    public abstract void setSubWarior();

    public String getName(){
        return name;
    };

    public String  getImage() {
        return image;
    }

    public VBox getImageVB (){
        return this;
    }

    public SubWarriorsI getSub(){
        return sub;
    }

}
