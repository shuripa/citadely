package ui;

import game.Battles;
import game.Player;
import game.Players;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Shur on 18.07.2016.
 * Цель:
 */
public class Main2 extends Application{
    Players ps;
    Battles bs;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        //TODO: снять коментарий
//        ps = new Players();
        ArrayList<Player> pl = ps.getPlayersList();
        bs = new Battles(pl);
        ObservableList<String> ol = FXCollections.observableArrayList();
        int i = 0;
        for (Player p: pl){
            ol.add(i,p.getName());
            i++;
        }

        ListView<String> lwp = new ListView<>(ol);

        //Корневая панель
        GridPane gp = new GridPane();
        createGp(gp);
        gp.add(lwp,0,1);
        gp.setMaxWidth(100);
        gp.setAlignment(Pos.CENTER);

        GridPane gp1 = new GridPane();
        createGp(gp1);
        gp1.add(gp,2,2);
        Button b4 = new Button("Поменять");
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene sc1 = new Scene(gp1);
                primaryStage.setScene(sc1);
            }
        });

        Scene sc = new Scene(gp);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    private void createGp(GridPane gp){
        //Создание сетки элементов
        gp.setGridLinesVisible(true);

        Button b1 = new Button("Выбор игрока");
        Button b2 = new Button("Бои");
        Button b3 = new Button("Кнопка3");

        gp.add(b1,0,0);
        gp.add(b2,1,0);
        gp.add(b3,2,0);
    }

}
