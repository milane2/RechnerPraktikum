public class Gameplay {

    private static final int SPIELZEIT = 90;
    // MNSZ = Maximale Nachsielzeit
    private static final int MNSZ = 5;
    // DBNA = Dauer bis Nächste Aktion
    private static final int DBNA = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft){
        int summe= 0;
        // getMotivation() + getStaerke();
        return ;
    }
    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        return; // Noch nicht fertig!!! Überarbeiten
    }
    public static void spielen(Spiel spiel) {
    }
}
//Der Mannschaftswert ermittelt aus Produkt  Stärke  Motivation der Mannschaft
// und der Erfahrung des Trainers
//-----------------------------------------------------------------------------------
// Trainer erfahrung
// public int getErfahrung(){
//        return  erfahrung;
//-----------------------------------------------------------------------------------
//Mannschaft  stärke und Motivation
//public int getMotivation(){
//        int summe= 0;
//        for(Spieler spieler : this.spielerListe){
//            summe += spieler.getMotiation();
//      }   summe += this.torwart.getMotiation();
//        return summe / (this.spielerListe.size() + 1);
//    }
//-----------------------------------------------------------------------------------
//    public int getStaerke() {
//        int summe2= 0;
//        for(Spieler spieler : this.spielerListe){
//            summe2 += spieler.getStaerke();
//        }
//        summe2 += this.torwart.getStaerke();
//        return summe2 / (this.spielerListe.size() + 1);