public abstract class Moebelstueck {

    String inventarnr;
    String bezeichnung;
    String beschreibung;
    String material;
    double gewicht;


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
    public void setBezeichnung(){
        this.bezeichnung = bezeichnung;
    }
    public void setBeschreibung(){
        this.beschreibung = beschreibung;
    }
    public void setMaterial(){
        this.material = material;
    }
    public void setGewicht(){
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
