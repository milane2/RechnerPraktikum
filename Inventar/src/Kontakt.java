public class Kontakt {

    private String e_mail;
    private String telBuero;
    private String telMobil;

    public Kontakt(String e_mail, String telBuero, String telMobil){

        this.e_mail = e_mail;
        this.telBuero = telBuero;
        this.telMobil = telMobil;
    }
    //GET
    public String getE_mail(){
        return e_mail;
    }
    public String getTelBuero(){
        return telBuero;
    }
    public String getTelMobil(){
        return telMobil;
    }
    //SET
    public void setE_mail(String e_mail){
        this.e_mail = e_mail;
    }
    public void setTelBuero(String telBuero){
        this.telBuero = telBuero;
    }
    public void setTelMobil(String telMobil){
        this.telMobil = telMobil;
    }

    @Override
    public String toString(){
        String ausgabe;
        ausgabe = "\nE_mail: " + getE_mail();
        ausgabe += "\nTelBuero: " + getTelBuero();
        ausgabe += "\nTelMobil: " + getTelMobil();;
        return ausgabe;
    }
}
