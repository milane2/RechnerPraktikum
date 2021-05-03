import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    public Mannschaft (String name,Trainer Trainer, Torwart Torwart, ArrayList <Spieler> spielerListe ){

        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
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
        return torwart;
    }
    public void setTorwart() {
        this.torwart = torwart;
    }

    public ArrayList getSpielerListe(){
        return spielerListe;
    }
    public void setSpielerListe() { //spielerListe : ArrayList<Spieler>//
        this.spielerListe = spielerListe;
    }

    public int getMotivation(){
        int summe= 0;
        for(Spieler spieler : this.spielerListe){
            summe += spieler.getMotiation();
        }
        summe += this.torwart.getMotiation();
        return summe / (this.spielerListe.size() + 1);
    }
    public int getStaerke() {
        int summe2= 0;
        for(Spieler spieler : this.spielerListe){
            summe2 += spieler.getStaerke();
        }
        summe2 += this.torwart.getStaerke();
        return summe2 / (this.spielerListe.size() + 1);
    }
    public String toString(){
        String ausgabe;
        ausgabe ="\nName: " + getName();
        ausgabe += "\nTrainer: " + getTrainer();
        ausgabe += "\nTorwart: " + getTorwart();
        ausgabe += "\nSpielerListe: " + getSpielerListe();
        return ausgabe;
    }
}