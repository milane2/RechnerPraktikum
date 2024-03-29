/*
 * Diese Klasse hält eine Aufzählung aller Befehlswörter, die dem
 * Spiel bekannt sind. Mit ihrer Hilfe werden eingetippte Befehle
 * erkannt.
 *
 * @author  Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */

public class Befehlswoerter {
    // ein konstantes Array mit den gültigen Befehlswörtern
    private static final String gueltigeBefehle[] = {
        "go", "quit", "help"
    };

    /**
     * Konstruktor - initialisiere die Befehlswörter.
     */
    public Befehlswoerter()
    {
        // nichts zu tun momentan...
    }

    /**
     * Prüfe, ob eine gegebene Zeichenkette ein gültiger
     * Befehl ist.
     * @return 'true', wenn die gegebene Zeichenkette ein gültiger
     * Befehl ist, 'false' sonst.
     */
    public boolean istBefehl(String eingabe) {
        for(int i = 0; i < gueltigeBefehle.length; i++) {
            if(gueltigeBefehle[i].equals(eingabe))
                return true;
        }
        // Wenn wir hierher gelangen, wurde die Eingabe nicht
        // in den Befehlswörter gefunden.
        return false;
    }
}