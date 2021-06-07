public class Tisch extends Moebelstueck {

    double hoehe;
    double laenge;
    double breite;

    public Tisch (String inventarnr, String bezeichnung,double hoehe, double laenge, double breite) {

        super(inventarnr, bezeichnung);
        this.hoehe = hoehe;
        this.laenge = laenge;
        this.breite = breite;
    }
    //GET
    public double getHoehe(){
        return hoehe;
    }
    public double getLaenge(){
        return laenge;
    }
    public double getbreite(){
        return breite;
    }
    //SET
    public void sethoehe(){
        this.hoehe = hoehe;
    }
    public void setLaenge(){
        this.laenge = laenge;
    }
    public void setBreite(){
        this.breite = breite;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + "[" + inventarnr + ", " +  bezeichnung + "]";
    }
}