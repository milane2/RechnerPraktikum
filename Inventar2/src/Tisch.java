public class Tisch extends Moebelstueck{

    private double hoehe;
    private double laenge;
    private double breite;

    public Tisch(String bezeichnung,String inventarNr) {
    super( bezeichnung,inventarNr);

    }
    public double getBreite() {
        return breite;
    }
    public double getLaenge() {
        return laenge;
    }
    public double getHoehe() {
        return hoehe;
    }
    public void setBreite(double breite) {
        this.breite = breite;
    }
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public  String toString(){
        String ausgabe;
        ausgabe ="\nInventarNr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nBreite: " + getBreite();
        ausgabe += "\nLänge: " + getLaenge();
        ausgabe +="\nHöhe: " + getHoehe();
        return ausgabe;
    }

}
