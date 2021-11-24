public class Kontakt {

    private String mail;
    private String telBuero;
    private String telMobil;

    public Kontakt(String mail, String telBuero, String telMobil){
        this.mail = mail;
        this.telBuero = telBuero;
        this.telMobil = telMobil;
    }

    public String getTelMobil() {
        return telMobil;
    }

    public void setTelMobil(String telMobil) {
        this.telMobil = telMobil;
    }

    public String getTelBuero() {
        return telBuero;
    }

    public void setTelBuero(String telBuero) {
        this.telBuero = telBuero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String toString(){
        String ausgabe;
        ausgabe ="\nMail: " + getMail();
        ausgabe += "\nTelefonBüro: " + getTelBuero();
        ausgabe += "\nTelefonMobil: " + getTelMobil();
        return ausgabe;
    }
}
