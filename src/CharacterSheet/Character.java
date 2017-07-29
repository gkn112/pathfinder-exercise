//package CharacterSheet;
///**
// * Created by gkn on 25.07.2017.
// */
//
//import CharacterSheet.ReadSheet;
//public class Character extends MainClass{
//
//    public Character() {
//
//        ReadSheet c1 = new ReadSheet("Max.xls");
//
//        String name = c1.getName();
//        int level = c1.getLevel();
//        String race = c1.getRace();
//        String clss = c1.getClss();
//
//        int str = c1.str;
//        int dex = c1.dex;
//        int con = c1.con;
//        int intl = c1.intl;
//        int wis = c1.wis;
//        int cha = c1.cha;
//
//        //Main Abilities and the Modificators:
//        int[] abMod = {0,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13,14,14,15,15,16,16,17,17};
//
//        System.out.println("CHARACTER SHEET\n");
//
//        System.out.println("NAME:\t" + name + "\nLEVEL:\t" + level);
//        System.out.println("RACE:\t" + race + "\nCLASS:\t" + clss + "\n");
//
//
//        if (abMod[str]>=0){
//        System.out.println("STR:\t" + str + "\t(+" + abMod[str] +")\t\t");
//        }else{
//            System.out.println("STR:\t" + str + "\t(" + abMod[str] + ")\t\t");
//        }
//
//        if (abMod[dex]>=0){
//            System.out.println("DEX:\t" + dex + "\t(+" + abMod[dex] +")");
//        }else{
//            System.out.println("DEX:\t" + dex + "\t(" + abMod[dex] +")");
//        }
//
//
//
//        if (abMod[con]>=0){
//            System.out.println("CON:\t" + con + "\t(+" + abMod[con] +")\t\t");
//        }else{
//            System.out.println("CON:\t" + con + "\t(" + abMod[con] + ")\t\t");
//        }
//
//        if (abMod[intl]>=0){
//            System.out.println("INT:\t" + intl + "\t(+" + abMod[intl] +")");
//        }else{
//            System.out.println("INT:\t" + intl + "\t(" + abMod[intl] +")");
//        }
//
//
//
//        if (abMod[wis]>=0){
//            System.out.println("WIS:\t" + wis + "\t(+" + abMod[wis] +")"+ "\t\t");
//        }else{
//            System.out.println("WIS:\t" + wis + "\t(" + abMod[wis] +")"+ "\t\t");
//        }
//
//        if (abMod[cha]>=0){
//            System.out.println("CHA:\t" + cha + "\t(+" + abMod[cha] +")"+ "\n\n\n");
//        }else{
//            System.out.println("CHA:\t" + cha + "\t(" + abMod[cha] +")"+ "\n\n\n");
//        }
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//}
//
