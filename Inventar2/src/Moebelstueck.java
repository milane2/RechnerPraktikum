public abstract class Moebelstueck {

    private String inventarNr;
    private String bezeichnung;
    private  String beschreibung;
    private  String material;
    private double gewicht;

    public Moebelstueck(String inventarNr,String bezeichnung){
        this.inventarNr = inventarNr;
        this.bezeichnung = bezeichnung;
    }

    public String getMaterial() {
        return material;
    }
    public double getGewicht() {
        return gewicht;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public String getInventarNr() {
        return inventarNr;
    }
    public String getBezeichnung() {
        return bezeichnung;
    }


    public void setMaterial(String material) {
        this.material = material;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    public void setInventarNr(String inventarNr) {
        this.inventarNr = inventarNr;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public  String toString(){
        String ausgabe;
        ausgabe ="\nInventarNr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nMaterial: " + getMaterial();
        ausgabe += "\nGewicht: " + getGewicht();
        return ausgabe;
    }
}
