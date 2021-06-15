public abstract class Moebelstueck {

    private String inventarNr;
    private String bezeichnung;
    private String beschreibung;
    private String material;
    private double gewicht;

    public Moebelstueck (String inventarNr, String bezeichnung,String beschreibung,String material,double gewicht) {

        this.inventarNr = inventarNr;
        this.bezeichnung = bezeichnung;
        this.beschreibung = beschreibung;
        this.material = material;
        this.gewicht = gewicht;
    }
    // GET
    public String getInventarNr(){
        return inventarNr;
    }
    public String getBezeichnung(){
        return bezeichnung;
    }
    public String getBeschreibung(){
        return beschreibung;
    }
    public String getMaterial(){
        return material;
    }
    public double getGewicht(){
        return gewicht;
    }
    //SET
    public void setInventarNr(String inventarNr){
        this.inventarNr = inventarNr;
    }
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }
    public String toString(){
        String ausgabe;
        ausgabe ="\nInventarNr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nMaterial: " + getMaterial();
        ausgabe += "\nGewicht: " + getGewicht();
        return ausgabe;
    }
}
