package ui;

import game.Battles;
import game.Player;
import game.Players;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.annotations.Ignore;
import warriors.Warrior;


/**
 * Created by Shur on 27.07.2016.
 * Цель:
 */

@Ignore

public class Citadely extends Application {
    Battles bs;
    private int CountWarior = 4;
    Label warName[] = new Label[CountWarior];

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Основаная панель Бордер-панель (создание)
        BorderPane b = new BorderPane();

        //Создание класса со списком играков.
        //TODO: снять коментарий
//        Players playerList = new Players(); //
        final Player player[] = new Player[1]; //выбранные игроки

        //Создание списка наполнения комбобоксов
        ObservableList<String> players = FXCollections.observableArrayList();
        int i = 0;

        //TODO: снять коментарий
//        for (Player p: playerList.getPlayersList()){
//            players.add(imageProperty,p.getName());
//            imageProperty++;
//        }

        //Создание комбобоксов играков
        //Установка действий на комбобокс
        final ComboBox<String> cbPlayer1 = new ComboBox<>(players);

        cbPlayer1.setOnAction((ActionEvent ev) ->{
            //Создание нижней панели
            TilePane warTiles = new TilePane(createReservesWarriors2(),createReservesWarriors2());
            warTiles.setSnapToPixel(false);
            warTiles.setPrefColumns(2);
            warTiles.prefTileWidthProperty().bind(Bindings.selectDouble(warTiles.parentProperty(), new String[]{"width"}).divide(2));

            b.setBottom(warTiles);
            String s = cbPlayer1.getValue().toString();
            int n = 0;
            //TODO: снять коментарий

//            for (Player p: playerList.getPlayersList()){
//                if (s == p.getName()) {
//                    //Создание войск в замке
//                    for (Warrior w : p.getCastle().getWarriors().getArrayWarrior()) {
//                        warName[n++].setText(w.getName());
//                    }
//                }
//            }

        });

        final ComboBox<String> cbPlayer2 = new ComboBox<>(players);
//        cbPlayer2.setOnAction(e ->{
//            String s = cbPlayer1.getItems().toString();
//            for (Player p: playerList.getPlayerList()){
//                if (s == p.getName()) player[1] = p;
//            }
//        });

        //Создание наполнение верхнего VBoxa (верхняя панел с меню)
        Button m1 = new Button("Бои");
        Button m2 = new Button("Экспы");
        TilePane menuTP = new TilePane(m1, m2);

        //Создание наполнения верхнего VBoxa (нижняя панель с комбобоксами игроков)
        TilePane playerTP = new TilePane(cbPlayer1,cbPlayer2);
        playerTP.setOrientation(Orientation.HORIZONTAL);
        playerTP.setPrefColumns(2);
        playerTP.setSnapToPixel(true);
        playerTP.setAlignment(Pos.TOP_LEFT);
        playerTP.prefTileWidthProperty().bind(Bindings.selectDouble(playerTP.parentProperty(), new String[]{"width"}).divide(2));

        //TOP-VBox верхняя панель для меню и играков
        VBox topPane = new VBox(menuTP, playerTP);
        topPane.setAlignment(Pos.TOP_LEFT);

        //Компоновка TOPa основной панели
        b.setTop(topPane);


//        ArrayList<Warrior> warriors = pl.

        //Битвы
//        Battles bs = new Battles(pl);


        //Запуск на испольнение
        Scene s = new Scene(b);
        primaryStage.setScene(s);
        primaryStage.show();
    }

    private FlowPane createReservesWarriors(){
        //Панель для войск в замке
        FlowPane castleWarriorsPane = new FlowPane();
        VBox warBox [] = new VBox[CountWarior];
        Image warImage[] = new Image[CountWarior];
        ImageView warImageView[] = new ImageView[CountWarior];
        for (int i = 0; i < CountWarior; i++) { //Количество войск
            warName[i]= new Label("-");
            warImage[i] = new Image(getClass().getResourceAsStream("Pikiner.jpg"));
            warImageView[i] = new ImageView(warImage[i]);
            warBox[i] = new VBox();
            warBox[i].getChildren().addAll(warImageView[i],warName[i]);
            castleWarriorsPane.getChildren().add(warBox[i]);
        }
        return castleWarriorsPane;
    }

    private ListView<VBox> createReservesWarriors2(){
        //Панель для войск в замке
        ListView<VBox> castleWarriorsListView = new ListView<>();
        VBox warBox;
        ImageView warImageView;
        ObservableList<VBox> items = FXCollections.observableArrayList();
        for (int i = 0; i < CountWarior; i++) { //Количество войск
            warName[i]= new Label("-");
            warImageView = new ImageView(new Image(getClass().getResourceAsStream("warriors\\units\\Pikiner.jpg")));
            warImageView.fitHeightProperty().setValue(90);
            warImageView.preserveRatioProperty().setValue(true);
            warBox = new VBox();
            warBox.getChildren().addAll(warImageView,warName[i]);

            items.add(warBox);
        }
        castleWarriorsListView.setPrefSize(500,115);
        castleWarriorsListView.setItems(items);
        castleWarriorsListView.setOrientation(Orientation.HORIZONTAL);
        return castleWarriorsListView;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

