public class Gameplay {

    private static final int SPIELZEIT = 90;
    // MNSZ = Maximale Nachsielzeit
    private static final int MNSZ = 5;
    // DBNA = Dauer bis Nächste Aktion
    private static final int DBNA = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft){
        int summe;
        summe = Mannschaft.getMotivation() + Mannschaft.getStaerke();
        summe =+ Trainer.getErfahrung();
        return summe;
    }
    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {

    }
    public static void spielen(Spiel spiel) {
    }
}
//if (Spieler.Torschuss > Torwart.Reaktion){
//            return true;
//        }
//        else return false;