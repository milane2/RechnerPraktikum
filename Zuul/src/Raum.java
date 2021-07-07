/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Raum 
{
    public String beschreibung;
    public Raum nordausgang;
    public Raum suedausgang;
    public Raum ostausgang;
    public Raum westausgang;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge.
     * @param beschreibung enth�lt eine Beschreibung in der Form
     *        "in einer K�che" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordeingang.
     * @param osten Der Osteingang.
     * @param sueden Der S�deingang.
     * @param westen Der Westeingang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen) 
    {
        if(norden != null)
            nordausgang = norden;
        if(osten != null)
            ostausgang = osten;
        if(sueden != null)
            suedausgang = sueden;
        if(westen != null)
            westausgang = westen;
    }

    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }

}
