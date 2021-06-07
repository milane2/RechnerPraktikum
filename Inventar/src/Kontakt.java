public class Kontakt {

    String e_mail;
    String telBuero;
    String telMobil;

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
    public void setE_mail(){
        this.e_mail = e_mail;
    }
    public void setTelBuero(){
        this.telBuero = telBuero;
    }
    public void setTelMobil(){
        this.telMobil = telMobil;
    }

}
