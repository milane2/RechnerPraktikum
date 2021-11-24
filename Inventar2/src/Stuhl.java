public class Stuhl extends  Moebelstueck {

    private double hoeheSitz;

    public Stuhl(String inventarNr, String bezeichnung){
        super(inventarNr,bezeichnung);
    }

    public double getHoeheSitz() {
        return hoeheSitz;
    }

    public void setHoeheSitz(double hoeheSitz) {
        this.hoeheSitz = hoeheSitz;
    }
    public  String toString(){
        String ausgabe;
        ausgabe ="\nInventarNr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nSitzhöhe: " + getHoeheSitz();
        return ausgabe;
    }
}