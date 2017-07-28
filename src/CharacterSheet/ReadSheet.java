package CharacterSheet;

/**
 * Created by gkn on 25.07.2017.
 */

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadSheet extends MainClass{

    public String name,clss,race;
    public int level,str,dex,con,intl,wis,cha;



    public static HSSFWorkbook readFile(String filename) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename)) {
            return new HSSFWorkbook(fis);        // NOSONAR - should not be closed here
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClss() {
        return clss;
    }

    public void setClss(String clss) {
        this.clss = clss;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getIntl() {
        return intl;
    }

    public void setIntl(int intl) {
        this.intl = intl;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    //THE CONSTRUCTOR:
    public ReadSheet(String filename){

        try {
           HSSFWorkbook wb = readFile(filename);

            try {

                HSSFSheet sheet = wb.getSheetAt(0);

                String nameVal = sheet.getRow(0).getCell(1).getStringCellValue();
                int lvlVal = (int) sheet.getRow(1).getCell(1).getNumericCellValue();
                String classVal = sheet.getRow(2).getCell(1).getStringCellValue();
                String raceVal = sheet.getRow(3).getCell(1).getStringCellValue();
                int strVal = (int) sheet.getRow(4).getCell(1).getNumericCellValue();
                int dexVal = (int) sheet.getRow(5).getCell(1).getNumericCellValue();
                int conVal = (int) sheet.getRow(6).getCell(1).getNumericCellValue();
                int intVal = (int) sheet.getRow(7).getCell(1).getNumericCellValue();
                int wisVal = (int) sheet.getRow(8).getCell(1).getNumericCellValue();
                int chaVal = (int) sheet.getRow(9).getCell(1).getNumericCellValue();


//                name = nameVal;
//                clss = classVal;
//                level = lvlVal;
//                race = raceVal;
//                str = strVal;
//                dex = dexVal;
//                con = conVal;
//                intl = intVal;
//                wis = wisVal;
//                cha = chaVal;


            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }







    }
}
