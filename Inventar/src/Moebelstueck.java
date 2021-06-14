public abstract class Moebelstueck {

    private String inventarnr;
    private String bezeichnung;
    private String beschreibung;
    private String material;
    private double gewicht;


    public Moebelstueck (String inventarnr, String bezeichnung) {

        this.inventarnr = inventarnr;
        this.bezeichnung = bezeichnung;
    }
    // GET
    public String getInventarnr(){
        return inventarnr;
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
    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public void setBeschreibung(String beschreibnung){
        this.beschreibung = beschreibung;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setGewicht(String gewicht){
        this.gewicht = gewicht;
    }
    public String toString(){
        String ausgabe;
        ausgabe ="\nInventarnr: " + getInventarnr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nMaterial: " + getMaterial();
        ausgabe += "\nGewicht: " + getGewicht();
        return ausgabe;
    }
}
