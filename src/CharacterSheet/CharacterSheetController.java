package CharacterSheet;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CharacterSheetController {

    ReadSheet c1 = new ReadSheet("Aeveld.xls");

    String name = c1.getName();
    int level = c1.getLevel();
    String race = c1.getRace();
    String clss = c1.getClss();

    int str = c1.getStr();
    int dex = c1.getDex();
    int con = c1.getCon();
    int intl = c1.getIntl();
    int wis = c1.getWis();
    int cha = c1.getCha();


    // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CharacterSheetGui.fxml"));


    @FXML
    TextField characterNameField;

    @FXML
    Button addNameButton;



    @FXML
    protected void handleAddNameButtonAction(ActionEvent event) {
        characterNameField.setText(name);

    }


}


//    @FXML
//    private void initialize() {
//        characterName.setText(name);
//    }









