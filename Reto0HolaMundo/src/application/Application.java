/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import controller.ModelFactory;
import view.ViewFactory;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author alexs
 */
public class Application{

    private static ResourceBundle configFile;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        configFile = ResourceBundle.getBundle("controller.Config");
        new Controller().run(ViewFactory.getView(configFile.getString("VIEW")), ModelFactory.getModel(configFile.getString("MODEL")));
    }

}
