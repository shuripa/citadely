package ui;

        import game.Players;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.Scene;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.VBox;
        import ui.obsSquare.SubChoice;
        import ui.obsSquare.WarSquare;

public class uiController {
    private Players playersList1;
    private Players playersList2;
    //ComboBoxes
    @FXML private ComboBox<String> cb_player1;
    @FXML private ComboBox<String> cb_player2;

    //ListViewers
    @FXML private ListView<VBox> lw_player1;
    @FXML private ListView<VBox> lw_player2;

    //ImageViewers Colon
    @FXML private ImageView ivCol1Play1;
    @FXML private ImageView ivCol2Play1;
    @FXML private ImageView ivCol3Play1;
    @FXML private ImageView ivCol0Play1;
    //including HBox
    //@FXML HBox inCol0Play1;
    @FXML HBox inCol1Play1;
    @FXML ColonController inCol1Play1Controller;
    @FXML HBox inCol2Play1;
    @FXML ColonController inCol2Play1Controller;
    @FXML HBox inCol3Play1;
    @FXML ColonController inCol3Play1Controller;
    @FXML HBox inCol0Play1;
    @FXML ColonController inCol0Play1Controller;
    //TextFields Count
    @FXML private TextField Col1CountPlay1;
    @FXML private TextField Col2CountPlay1;
    @FXML private TextField Col3CountPlay1;
    @FXML private TextField Col0CountPlay1;


    @FXML private ImageView ivCol3Play2;
    @FXML private ImageView ivCol2Play2;
    @FXML private ImageView ivCol1Play2;
    @FXML private ImageView ivCol0Play2;
    //@FXML HBox inCol0Play1;
    @FXML HBox inCol1Play2;
    @FXML
    ColonController inCol1Play2Controller;
    @FXML HBox inCol2Play2;
    @FXML
    ColonController inCol2Play2Controller;
    @FXML HBox inCol3Play2;
    @FXML
    ColonController inCol3Play2Controller;
    @FXML HBox inCol0Play2;
    @FXML
    ColonController inCol0Play2Controller;
    //TextFields Count
    @FXML private TextField Col1CountPlay2;
    @FXML private TextField Col2CountPlay2;
    @FXML private TextField Col3CountPlay2;
    @FXML private TextField Col0CountPlay2;

    //ImageViewers Gun
    @FXML private ImageView ivGun3Col3;
    @FXML private ImageView ivGun2Col3;
    @FXML private ImageView ivGun1Col3;
    @FXML private ImageView ivGun3Col2;

    @FXML private ImageView ivGun2Col2;
    @FXML private ImageView ivGun1Col2;
    @FXML private ImageView ivGun3Col1;
    @FXML private ImageView ivGun2Col1;

    @FXML private ImageView ivGun1Col1;
    @FXML private ImageView ivGun3Col4;
    @FXML private ImageView ivGun2Col4;
    @FXML private ImageView ivGun1Col4;

    //Square
    @FXML WarSquare ws1Play1;
    @FXML WarSquare ws2Play1;
    @FXML WarSquare ws3Play1;
    @FXML WarSquare ws0Play1;

    @FXML WarSquare ws1Play2;
    @FXML WarSquare ws2Play2;
    @FXML WarSquare ws3Play2;
    @FXML WarSquare ws0Play2;

    @FXML
    ColonController Colon;


@FXML
void setOnAction_player1(ActionEvent event) {
    String cb = cb_player1.getValue();
    lw_player1.setItems(playersList1.getPlayer(cb).getCastle().getWarriors().getWarItems());
    subject.registerArmy(playersList1.getPlayer(cb).getArmyI(), 1);

    ivCol0Play1.imageProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(0).imageProperty);
    ivCol1Play1.imageProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(1).imageProperty);
    ivCol2Play1.imageProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(2).imageProperty);
    ivCol3Play1.imageProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(3).imageProperty);

    inCol0Play1Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(0).propAttack);
    inCol1Play1Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(1).propAttack);
    inCol2Play1Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(2).propAttack);
    inCol3Play1Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(3).propAttack);

    inCol0Play1Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(0).propProtection);
    inCol1Play1Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(1).propProtection);
    inCol2Play1Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(2).propProtection);
    inCol3Play1Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(3).propProtection);

    inCol0Play1Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(0).propSpirit);
    inCol1Play1Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(1).propSpirit);
    inCol2Play1Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(2).propSpirit);
    inCol3Play1Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getArmy().getColon(3).propSpirit);

}

@FXML
void setOnAction_player2(ActionEvent event) {
    String cb = cb_player2.getValue();

    lw_player2.setItems(playersList1.getPlayer(cb).getCastle().getWarriors().getWarItems());
    subject.registerArmy(playersList1.getPlayer(cb).getCastle().getArmyI(), 0);

    ivCol0Play2.imageProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(0).imageProperty);
    ivCol1Play2.imageProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(1).imageProperty);
    ivCol2Play2.imageProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(2).imageProperty);
    ivCol3Play2.imageProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(3).imageProperty);

    inCol0Play2Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(0).propAttack);
    inCol1Play2Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(1).propAttack);
    inCol2Play2Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(2).propAttack);
    inCol3Play2Controller.attack.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(3).propAttack);

    inCol0Play2Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(0).propProtection);
    inCol1Play2Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(1).propProtection);
    inCol2Play2Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(2).propProtection);
    inCol3Play2Controller.protection.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(3).propProtection);

    inCol0Play2Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(0).propSpirit);
    inCol1Play2Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(1).propSpirit);
    inCol2Play2Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(2).propSpirit);
    inCol3Play2Controller.spirit.textProperty().bind(playersList1.getPlayer(cb).getCastle().getArmy().getColon(3).propSpirit);
}

@FXML
private SubChoice subject;
//TODO: удалить параметр, если не нужен будет.

public void initialize(){
    subject = new SubChoice();

    playersList1 = new Players();
//    playersList2  = new Players((SubArmyI)subject);
    //TODO: Нужны ли два плеерлиста?
    cb_player1.setItems(playersList1.getPlayersListNames());
    cb_player2.setItems(playersList1.getPlayersListNames());

    ws0Play1.setSub(subject, 1, 0);
    ws1Play1.setSub(subject, 1, 1);
    ws2Play1.setSub(subject, 1, 2);
    ws3Play1.setSub(subject, 1, 3);
    ws0Play2.setSub(subject, 0, 0);
    ws1Play2.setSub(subject, 0, 1);
    ws2Play2.setSub(subject, 0, 2);
    ws3Play2.setSub(subject, 0, 3);
}

public void setBindings(Scene scene){
    //TODO: Установить размер ListView для Player1.
    lw_player1.prefWidthProperty().bind(scene.widthProperty().divide(2));

}

}
