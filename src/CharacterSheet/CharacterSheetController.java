package CharacterSheet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

import javafx.scene.control.SpinnerValueFactory;


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
    TextField strField;

    @FXML
    TextField dexField;

    @FXML
    TextField conField;

    @FXML
    TextField intField;

    @FXML
    TextField wisField;

    @FXML
    TextField chaField;

    @FXML
    Spinner<Integer> levelSpinner;

    @FXML
    Label strModField;
    @FXML
    Label conModField;

    @FXML
    Label dexModField;

    @FXML Label intModField;

    @FXML Label wisModField;

    @FXML Label chaModField;


    @FXML
    protected void initialize() {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99, 0);
        levelSpinner.setValueFactory(valueFactory);

    }


    //Das ist der Importbutton, der den File chooser öffnet und die Exceldatei einliest, aber bis jetzt nur aus dem falschen pfad
    @FXML
    protected void handleImportButtonAction(ActionEvent event) throws IOException {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        //chooser.showOpenDialog(addNameButton.getScene().getWindow()); //es reicht irgendein node, hier addNameButton, wofür ich eine fx:id habe. die sind alle in der szene
        File file = chooser.showOpenDialog(chaField.getScene().getWindow());
        ReadSheet sh = new ReadSheet(file.getAbsolutePath());

        //Importiere Namen
        characterNameField.setText(sh.getName());

        //Importiere Level
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 99, sh.getLevel());
        levelSpinner.setValueFactory(valueFactory);


        //Todo: importiere Rasse

        //Todo: importiere Klasse

        //Importiere Werte
        strField.setText(String.valueOf(sh.getStr()));
        dexField.setText(String.valueOf(sh.getDex()));
        conField.setText(String.valueOf(sh.getCon()));
        intField.setText(String.valueOf(sh.getIntl()));
        wisField.setText(String.valueOf(sh.getWis()));
        chaField.setText(String.valueOf(sh.getCha()));

        int[] abMod = {0,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17};


//Anderer Weg, den Mod zu finden
//        int strMod = ((sh.getStr()/2)-5);
//        System.out.println(strMod);
//        if( ((strMod/2)-5)>= 0) {
//            strModField.setText("+" + strMod + "");
//        }else{
//            strModField.setTextFill(Color.RED);
//            strModField.setText(strMod + "");
//        }

        int strMod = abMod[sh.getStr()];
        if(strMod >= 0){
            strModField.setText("+" + strMod + "");
        }else{
            strModField.setTextFill(Color.RED);
            strModField.setText(strMod + "");
        }


        int dexMod = abMod[sh.getDex()];
        System.out.println(dexMod);
        if(dexMod>= 0) {
            dexModField.setText("+" + dexMod + "");
        }else{
            dexModField.setTextFill(Color.RED);
            dexModField.setText(dexMod + "");
        }

        int conMod = abMod[sh.getCon()];
        System.out.println(conMod);
        if(conMod >= 0) {
            conModField.setText("+" + conMod + "");
        }else{
            conModField.setTextFill(Color.RED);
            conModField.setText(conMod + "");
        }

        int intMod = abMod[sh.getIntl()];
        System.out.println(intMod);
        if(intMod >= 0) {
            intModField.setText("+" + intMod + "");
        }else{
            intModField.setTextFill(Color.RED);
            intModField.setText(intMod + "");
        }

        int wisMod = abMod[sh.getWis()];
        System.out.println(wisMod);
        if(wisMod >= 0) {
            wisModField.setText("+" + wisMod + "");
        }else{
            wisModField.setTextFill(Color.RED);
            wisModField.setText(wisMod + "");
        }

        int chaMod = abMod[sh.getCha()];
        System.out.println(chaMod);
        if(chaMod >= 0) {
            chaModField.setText("+" + chaMod + "");
        }else{
            chaModField.setTextFill(Color.RED);
            chaModField.setText(chaMod + "");
        }




    }


}










