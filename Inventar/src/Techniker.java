public class Techniker {

    private String vorname;
    private String nachname;
    private Kontakt kontakt;

    public Techniker(String vorname, String nachname, Kontakt kontakt ){

        this. vorname = vorname;
        this.nachname = nachname;
        this.kontakt = kontakt;
    }

    public String getVorname(){
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Kontakt getKontakt() {
        return kontakt;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setKontakt(Kontakt kontakt) {
        this.kontakt = kontakt;
    }

    public String toString(){
        String ausgabe;
        ausgabe = "\nVorname: " + getVorname();
        ausgabe += "\n:Nacname " + getNachname();
        ausgabe += "\nKontakt: " + getKontakt() ;
        return ausgabe;
    }
}