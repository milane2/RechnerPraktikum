public class Stuhl extends Moebelstueck {

    double hoeheSitz;

    public Stuhl (String inventarnr, String bezeichnung,double hoehe, double laenge, double breite) {

        super(inventarnr, bezeichnung);
        this.hoeheSitz = hoeheSitz;
    }
    //GET
    public double getHoeheSitz(){
        return hoeheSitz;
    }
    //SET
    public void sethoeheSitz(){
        this.hoeheSitz = hoeheSitz;
    }
    @Override
    public String toString(){
        return getClass().getSimpleName() + "[" + inventarnr + ", " +  bezeichnung + "]";
    }
}
