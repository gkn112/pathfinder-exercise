package CharacterSheet;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;


public class MainClass extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        //setUserAgentStylesheet(STYLESHEET_CASPIAN);
        Parent root = FXMLLoader.load(getClass().getResource("CharacterSheetGui.fxml"));
        primaryStage.setTitle("PATHFINDER COMPANION");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }


}

//get the screen size
//        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth() / 2, Screen.getPrimary().getBounds().getHeight() / 2);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }