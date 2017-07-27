package CharacterSheet;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class MainClass extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
       //Character xx = new Character("Max.xls");
        ReadSheet mx = new ReadSheet("Aeveld.xls");

        String name = mx.getName();



        Parent root = FXMLLoader.load(getClass().getResource("CharacterSheetGui.fxml"));
        primaryStage.setTitle("PATHFINDER: " +name);
        primaryStage.setScene(new Scene(root));


       // TextFlow tl = new TextFlow();
        //Font font = new Font("Tahoma", 48);

        //Text rightText = new Text();

        //rightText.setText("Sign in button pressed");

        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }

//    public ObservableList<Table> getTable() {
//        ObservableList<Table> theTable = FXCollections.observableList();
//        theTable.add(new Table("Aeveld","Druid","Human",3));
//        theTable.add(new Table("Max","Rogue","Halfling",2));
//        theTable.add(new Table("Paptar","Sorcerer","Human",3));
//    }

}








//public class MainClass{
//
//
//
//
//    public static void main(String[] args) {
//
//     Character max = new Character("Max.xls");
//
//    }
//
//}


//get the screen size
//        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth() / 2, Screen.getPrimary().getBounds().getHeight() / 2);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }