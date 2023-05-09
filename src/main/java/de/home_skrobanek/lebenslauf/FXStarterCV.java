package de.home_skrobanek.lebenslauf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FXStarterCV extends Application {

    public static Stage stage;
    public static Scene settingsScene, scene;

    public static void main(String[]args){
        System.out.println("CV of Timo Skrobanek");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Menu.fxml"));
        AnchorPane content = loader.load();

        scene = new Scene(content, 1200, 800);

        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("/Settings.fxml"));
        AnchorPane settings = loader2.load();

        settingsScene = new Scene(settings, 1200, 800);

        //stage properties
        stage.setScene(scene);
        stage.setResizable(true);
        stage.setTitle("CV Timo Skrobanek | V. 1.0");
        stage.show();
    }

    public static void changeState(StateManager state){
        if(state == StateManager.Main_MENU_STATE){
            stage.setScene(scene);
        }
        else if(state == StateManager.SETTINGS_MENU){
            stage.setScene(settingsScene);
        }
        else{
            System.err.println("This state is not allowed");
        }
    }
}
