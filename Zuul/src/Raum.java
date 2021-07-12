/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 *
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den
 * benachbarten Raum.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Raum {

    private String beschreibung;
    private Raum nordausgang;
    private Raum suedausgang;
    private Raum ostausgang;
    private Raum westausgang;
    private Raum treppeNachOben;
    private Raum treppeNachUnten;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthült eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */

    public Raum(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public String ausgaengeToString() {

    }
    public String getAusgang() {

    }
//----------------------------------------------
//    Raum lichtung Ausgang(" west down ");
//    Raum waldstueck Ausgang(" east south ");
//    Raum taverne Ausgang(" north up down ");
//    Raum hexenhaus Ausgang(" east ");
//    Raum dorfplatz Ausgang(" north south west ");
//    Raum gaestezimmer Ausgang(" down ");
//    Raum  keller Ausgang(" north up ");
//    Raum  geheimgang Ausgang(" east south ");
//    Raum  piratenhoele Ausgang(" west up ");
//---------------------------------------------------
    /**
     * Definiere die Ausgänge dieses Raums. Jede Richtung
     * führt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der Südeingang.
     * @param westen Der Westeingang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen, Raum oben, Raum unten)
    {
        if(norden != null)
            nordausgang = norden;
        if(osten != null)
            ostausgang = osten;
        if(sueden != null)
            suedausgang = sueden;
        if(westen != null)
            westausgang = westen;
        if(oben != null)
            treppeNachOben = oben;
        if(unten != null)
            treppeNachUnten = unten;
    }
    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }
}