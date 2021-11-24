public class Tisch extends Moebelstueck {
    
    private double hoehe;
    private double laenge;
    private double breite;

    public Tisch(String bezeichnung,String inventarNr) {
        super( bezeichnung,inventarNr);

    }

    //GET
    public double getHoehe(){
        return hoehe;
    }
    public double getLaenge(){
        return laenge;
    }
    public double getbreite(){
        return breite;
    }
    //SET
    public void sethoehe(double hoehe){
        this.hoehe = hoehe;
    }
    public void setLaenge(double laenge){
        this.laenge = laenge;
    }
    public void setBreite(double breite){
        this.breite = breite;
    }

    @Override
    public String toString() {
        String ausgabe;
        ausgabe = "\nInventarnr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nMaterial: " + getMaterial();
        ausgabe += "\nGewicht: " + getGewicht();
        ausgabe += "\nHöhe: " + getHoehe();
        ausgabe += "\nLänge: " + getLaenge();
        ausgabe += "\nBreite: " +getbreite();
        return ausgabe;
    }
}