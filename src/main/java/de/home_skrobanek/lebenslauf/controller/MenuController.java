package de.home_skrobanek.lebenslauf.controller;

import de.home_skrobanek.lebenslauf.FXStarterCV;
import de.home_skrobanek.lebenslauf.StateManager;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

/*
    Design example:
    https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwebapphuddle.com%2Fwp-content%2Fuploads%2F2016%2F11%2Faspree.png&f=1&nofb=1
 */
public class MenuController {

    //status for the change between settings and start-menu
    private int status = 0;
    @FXML
    protected void onSettingsClicked(){
        if(status == 0) {
            FXStarterCV.changeState(StateManager.SETTINGS_MENU);
            status++;
        }
        else {
            FXStarterCV.changeState(StateManager.Main_MENU_STATE);
            status = 0;
        }
    }

    @FXML
    protected void onClickHighschoolDegree(){
        showInformationAlert();
    }

    @FXML
    protected void onClickMiddleSchoolDegree(){
        showInformationAlert();
    }

    @FXML
    protected void onClickUniversityDegree(){
        showInformationAlert();
    }

    @FXML
    protected void readMoreFromBlog(){
        showInformationAlert();
    }

    private void showInformationAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Diese Funktion");
        alert.setHeaderText("Fehler");
        String s ="Dise Funktion ist aktuell noch nicht verfügbar.";
        alert.setContentText(s);
        alert.show();
    }

}
