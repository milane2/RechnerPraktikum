import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;


    public Mannschaft (String Trainer, String Torwart, ArrayList <Spieler> spielerListe ){
    }
    public String getName(){
        return  name;
    }
    public void setName() {

        this.name = name;
    }
    public Trainer getTrainer(){
        return  trainer;
    }
    public void setTrainer() {
        this.trainer = trainer;
    }

    public Torwart getTorwart(){
        return  torwart;
    }
    public void setTorwart() {
        this.torwart = torwart;
    }

    public ArrayList<Spieler> getSpielerListe(){
        return  spielerListe;
    }
    public void setSpielerListe() {
        this.spielerListe = spielerListe;
    }

    //public int getMotivation(){
    ;

    // }

    //public int getStaerke(){
    ;

    // }




















}