/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 *  "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes
 *  Adventure-Game. Ein Spieler kann sich in einer Umgebung bewegen,
 *  mehr nicht. Das Spiel sollte auf jeden Fall ausgebaut werden,
 *  damit es interessanter wird!
 *
 *  Zum Spielen muss eine Instanz dieser Klasse erzeugt werden und
 *  an ihr die Methode "spielen" aufgerufen werden.
 *
 *  Diese Instanz erzeugt und initialisiert alle anderen Objekte
 *  der Anwendung: Sie legt alle Räume und einen Parser an und
 *  startet das Spiel. Sie wertet auch die Befehle aus, die der
 *  Parser liefert, und sorgt für ihre Ausführung.
 *
 * @author  Michael Kolling und David J. Barnes
 * @version 2008.03.30
 */

public class Spiel {
    private Parser parser;
    private Raum aktuellerRaum;

    /**
     * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
     */

    public Spiel() {
        raeumeAnlegen();
        parser = new Parser();
    }

    private void raumInfoAusgeben() {
        System.out.println("Sie sind " + aktuellerRaum.gibBeschreibung());
        System.out.print("Ausgänge: " + aktuellerRaum.ausgaengeToString());
        System.out.println();
    }
    /**
     * Erzeuge alle Räume und verbinde ihre Ausgänge miteinander.
     */
    private void raeumeAnlegen() {
        Raum lichtung, waldstueck, taverne, hexenhaus, dorfplatz, gaestezimmer, keller, geheimgang, piratenhoehle;

        // die Räume erzeugen
        lichtung = new Raum("auf einer Lichtung, umgeben von dunklen Tannen");
        waldstueck = new Raum("im dunklen Wald");
        taverne = new Raum("in der Taverne, mit zwielichtigen Gestalten an der Theke");
        hexenhaus = new Raum("im Hexenhaus");
        dorfplatz = new Raum("auf dem Dorfplatz");
        gaestezimmer = new Raum("im gemütlichem Gästezimmer");
        keller = new Raum("in einen kalten Keller");
        geheimgang = new Raum("im engen Geheimgang");
        piratenhoehle = new Raum("in der versteckten Piratenhöle");

        // die Ausgänge initialisieren
        lichtung.setAusgang("down",piratenhoehle);
        lichtung.setAusgang("west" ,waldstueck);
        waldstueck.setAusgang("east" , lichtung);
        waldstueck.setAusgang("south" , dorfplatz);
        dorfplatz.setAusgang("south" ,taverne);
        dorfplatz.setAusgang("west" ,hexenhaus);
        dorfplatz.setAusgang("north",waldstueck);
        taverne.setAusgang("up" , gaestezimmer);
        taverne.setAusgang("down" , keller);
        gaestezimmer.setAusgang("down" , taverne);
        keller.setAusgang("up" , taverne);
        keller.setAusgang("north" , geheimgang);
        geheimgang.setAusgang("south" , keller);
        geheimgang.setAusgang("east" , piratenhoehle);
        piratenhoehle.setAusgang("up" , lichtung);
        piratenhoehle.setAusgang("west" , geheimgang);
        gaestezimmer.setAusgang("window", dorfplatz);
        gaestezimmer.setAusgang("window", dorfplatz);
        aktuellerRaum = lichtung;  // das Spiel startet auf der Lichtung
    }
    /**
     * Die Hauptmethode zum Spielen. Läuft bis zum Ende des Spiels
     * in einer Schleife.
     */
    public void spielen() {
        willkommenstextAusgeben();

        // Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
        // und führen sie aus, bis das Spiel beendet wird.

        boolean beendet = false;
        while (!beendet) {
            Befehl befehl = parser.liefereBefehl();
            beendet = verarbeiteBefehl(befehl);
        }
        System.out.println("Danke für dieses Spiel. Auf Wiedersehen.");
    }
    /**
     * Einen Begrüßungstext für den Spieler ausgeben.
     */
    private void willkommenstextAusgeben() {
        System.out.println();
        System.out.println("Willkommen zu Zuul!");
        System.out.println("Entdecke die Welt von Zuul. Doch Vorsicht, überall lauern Gefahren!");
        System.out.println("Tippen sie 'help', wenn Sie Hilfe brauchen.");
        System.out.println();
        raumInfoAusgeben();
    }
    /**
     * Verarbeite einen gegebenen Befehl (führe ihn aus).
     * @param befehl Der zu verarbeitende Befehl.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean verarbeiteBefehl(Befehl befehl) {
        boolean moechteBeenden = false;

        if(befehl.istUnbekannt()) {
            System.out.println("Ich weiß nicht, was Sie meinen...");
            return false;
        }
        String befehlswort = befehl.gibBefehlswort();
        if (befehlswort.equals("help"))
            hilfstextAusgeben();
        else if (befehlswort.equals("go"))
            wechsleRaum(befehl);
        else if (befehlswort.equals("quit")) {
            moechteBeenden = beenden(befehl);
        }
        return moechteBeenden;
    }
    // Implementierung der Benutzerbefehle:

    /**
     * Gib Hilfsinformationen aus.
     * Hier geben wir eine etwas alberne und unklare Beschreibung
     * aus, sowie eine Liste der Befehlswörter.
     */
    private void hilfstextAusgeben() {
        System.out.println("Sie haben sich verlaufen. Sie sind allein.");
        System.out.println("Sie irren in der Welt von Zuul herum.");
        System.out.println();
        System.out.println("Ihnen stehen folgende Befehle zur Verfügung:");
        System.out.println("   go quit help");
    }
    /**
     * Versuche, den Raum zu wechseln. Wenn es einen Ausgang gibt,
     * wechsele in den neuen Raum, ansonsten gib eine Fehlermeldung
     * aus.
     */
    private void wechsleRaum(Befehl befehl) {
        if(!befehl.hatZweitesWort()) {
            // Gibt es kein zweites Wort, wissen wir nicht, wohin...
            System.out.println("Wohin möchten Sie gehen?");
            return;
        }
        String richtung = befehl.gibZweitesWort();
        // Wir versuchen den Raum zu verlassen.
        Raum naechsterRaum = aktuellerRaum.getAusgang(richtung);
        if (naechsterRaum == null) {
            System.out.println("Dort ist kein Tor!");
        } else {

            aktuellerRaum = naechsterRaum;
            raumInfoAusgeben();
        }
    }
    /**
     * "quit" wurde eingegeben. überprüfe den Rest des Befehls,
     * ob das Spiel wirklich beendet werden soll.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean beenden(Befehl befehl) {
        if(befehl.hatZweitesWort()) {
            System.out.println("Was soll beendet werden?");
            return false;
        }
        else {
            return true;  // Das Spiel soll beendet werden.
        }
    }
}