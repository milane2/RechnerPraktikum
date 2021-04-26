import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    public Mannschaft (Trainer Trainer, Torwart Torwart, ArrayList <Spieler> spielerListe ){

        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
        this.name = name;
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

    }
