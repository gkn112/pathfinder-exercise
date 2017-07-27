package CharacterSheet;

public class Table {

    private String name, clss, race;
    private int level;

    public Table(){
       this.name = "N/A";
       this.clss = "N/A";
        this.race = "N/A";
        this.level = 0;
    }

    public Table(String name,String clss,String race,int level){
        this.name = name;
        this.clss = clss;
        this.race = race;
        this.level = level;
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
}
