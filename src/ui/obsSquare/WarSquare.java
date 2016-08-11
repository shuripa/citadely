package ui.obsSquare;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 * Created by Shur on 06.08.2016.
 * Цель:
 */
public class WarSquare extends Region implements ObsSquare{
    private boolean thisClicked = false;
    private boolean isClicked = false;
    private int actGroup;
    private int actCell;
    private SubSquare sub;

    public WarSquare(){
        addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, t->{
            if (thisClicked == false) this.setStyle("-fx-border-width: 3; -fx-border-color: dodgerblue");
        });
        addEventHandler(MouseEvent.MOUSE_EXITED_TARGET, t->{
            if (thisClicked == false)this.setStyle("-fx-border-width: 1; -fx-border-color: dodgerblue");
        });

        addEventHandler(MouseEvent.MOUSE_CLICKED, t->{
            thisClicked = !thisClicked;
            //Нажатие на кнопку
            if (!(thisClicked & isClicked))sub.notifySquare(actGroup, actCell);
            //Уже нажата какая-то кнопка
            if ((thisClicked & isClicked)){
                sub.notifySquare(actGroup, actCell);
                this.setStyle("-fx-border-width: 2; -fx-border-color: red");
                thisClicked = !thisClicked;
            }

        });
    }

    @Override
    public void update(boolean isClicked) {
        this.isClicked = isClicked;

        if ((thisClicked == true) & (isClicked == false)) {
            thisClicked = !thisClicked;
        }
        // Повторное нажатие на ту же кнопку (Работает)
        if ((thisClicked==false)){
            this.setStyle("-fx-border-width: 1; -fx-border-color: dodgerblue");
        }

    }

    public void setSub (SubSquare sub, int actGroup, int actCell){
        this.sub = sub;
        this.actGroup = actGroup;
        this.actCell = actCell;
        sub.registerSquare(this);
    }

}
