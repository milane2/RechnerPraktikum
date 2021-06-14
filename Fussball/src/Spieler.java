public class Spieler extends Person {

    private int staerke;
    private int torschuss;
    private int motiation;
    private int erzielteTorschuesse;

    public Spieler(String name, int alter, int staerke, int torschuss, int motiation, int erzielteTorschuesse){
        super(name,alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motiation = motiation;
        this.erzielteTorschuesse = erzielteTorschuesse;
    }

    public int getStaerke(){
        return  staerke;
    }
    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }
    public int getTorschuss(){
        return  torschuss;
    }
    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getMotiation(){
        return motiation ;
    }
    public void setMotiation(int motiation) {
        this.motiation = motiation;
    }

    public int getErzielteTorschuesse(){
        return erzielteTorschuesse;
    }
    public void setErzielteTorschuesse() {
        this.erzielteTorschuesse =erzielteTorschuesse ;
    }

    public String toString(){
        String ausgabe;
        ausgabe = "\nName: " + getName();
        ausgabe += "\nAlter: " + getAlter();
        ausgabe += "\nStärke: " + getStaerke();
        ausgabe += "\nTorschuss: " + getTorschuss();
        ausgabe += "\nMotivation: " + getMotiation();
        ausgabe += "\nbislange erzielte Tore: " + getErzielteTorschuesse();
        return ausgabe;
    }
}