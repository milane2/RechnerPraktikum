public class Techniker {


    private String vorname;
    private String nachname;
    private Kontakt kontakt;

    public Techniker(String vorname, String nachname, Kontakt kontakt){
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontakt = kontakt;
    }

    public Kontakt getKontakt() {
        return kontakt;
    }

    public void setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String toString(){
        String ausgabe;
        ausgabe = "\nVorname: " + getVorname();
        ausgabe += "\nNacname: " + getNachname();
        ausgabe += "\nKontakt: " + getKontakt() ;
        return ausgabe;
    }
}