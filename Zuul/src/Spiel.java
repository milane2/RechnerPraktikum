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

public class Spiel
{
    private Parser parser;
    private Raum aktuellerRaum;

    /**
     * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
     */

    public Spiel()
    {
        raeumeAnlegen();
        parser = new Parser();
    }

    public void raumInfoAusgeben(){

        System.out.println("Sie sind " + aktuellerRaum.gibBeschreibung());
        System.out.print("Ausgänge: ");
        if(aktuellerRaum.nordausgang != null)
            System.out.print("north ");
        if(aktuellerRaum.ostausgang != null)
            System.out.print("east ");
        if(aktuellerRaum.suedausgang != null)
            System.out.print("south ");
        if(aktuellerRaum.westausgang != null)
            System.out.print("west ");
        System.out.println();
        if(aktuellerRaum.treppeNachOben != null)
            System.out.print("up ");
        if(aktuellerRaum.treppeNachUnten != null)
            System.out.print("down ");
        System.out.println();
    }
    /**
     * Erzeuge alle Räume und verbinde ihre Ausgänge miteinander.
     */
    private void raeumeAnlegen() {
        Raum lichtung, waldstueck, taverne, hexenhaus, dorfplatz, gaestezimmer, keller, geheimgang, piratenhoele;

        // die Räume erzeugen
        lichtung = new Raum("auf einer Lichtung, umgeben von dunklen Tannen");
        waldstueck = new Raum("im dunklen Wald");
        taverne = new Raum("in der Taverne, mit zwielichtigen Gestalten an der Theke");
        hexenhaus = new Raum("im Hexenhaus");
        dorfplatz = new Raum("auf dem Dorfplatz");
        gaestezimmer = new Raum("im Gästezimmer");
        keller = new Raum("im kalten Keller");
        geheimgang = new Raum("im engen Geheimgang");
        piratenhoele = new Raum("in der versteckten Piratenhöle");

        // die Ausgänge initialisieren
        lichtung.setzeAusgaenge(null,null,null,waldstueck,null,piratenhoele);
        waldstueck.setzeAusgaenge(null,lichtung,dorfplatz,null,null,null);
        taverne.setzeAusgaenge(dorfplatz,null,null,null,gaestezimmer,keller);
        hexenhaus.setzeAusgaenge(null, dorfplatz, null, null, null, null);
        dorfplatz.setzeAusgaenge(waldstueck,null,taverne,hexenhaus,null,null);
        gaestezimmer.setzeAusgaenge(null, null, null, null, null,taverne);
        keller.setzeAusgaenge(geheimgang,null, null, null,taverne, null);
        geheimgang.setzeAusgaenge(null,piratenhoele, keller, null, null, null);
        piratenhoele.setzeAusgaenge(null,null,null,geheimgang,lichtung,null);
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
        Raum naechsterRaum = null;
        if(richtung.equals("north")) {
            naechsterRaum = aktuellerRaum.nordausgang;
        }
        if(richtung.equals("east")) {
            naechsterRaum = aktuellerRaum.ostausgang;
        }
        if(richtung.equals("south")) {
            naechsterRaum = aktuellerRaum.suedausgang;
        }
        if(richtung.equals("west")) {
            naechsterRaum = aktuellerRaum.westausgang;
        }
        if(richtung.equals("up")) {
            naechsterRaum = aktuellerRaum.treppeNachOben;
        }
        if(richtung.equals("down")) {
            naechsterRaum = aktuellerRaum.treppeNachUnten;
        }
        if (naechsterRaum == null) {
            System.out.println("Dort ist kein Tor!");
        }
        else {

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
