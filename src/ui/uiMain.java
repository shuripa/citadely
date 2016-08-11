package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Shur on 04.08.2016.
 * Цель:
 */
public class uiMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Создание загрузчика FXML
        FXMLLoader fxmlLoader = new FXMLLoader(uiMain.class.getResource("ui.fxml"));
        //Загрузка корневого узла
        BorderPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 1200, 700);

        //uiController - название класса контроллера
        final uiController controller = fxmlLoader.getController();
        controller.initialize();
        controller.setBindings(scene);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        //TODO: Развернуть окно на весь экран
//        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Для выхода из полноэкранного режима нажмите ESC");
        primaryStage.setTitle("Цитадели");

        //Отображение окна
        primaryStage.show();
        primaryStage.heightProperty();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
