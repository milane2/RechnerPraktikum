public class Stuhl extends Moebelstueck {

    private double hoeheSitz;

    public Stuhl(String inventarNr, String bezeichnung){
        super(inventarNr,bezeichnung);
        this.hoeheSitz = hoeheSitz;
    }

        this.hoeheSitz = hoeheSitz;

    //GET
    public double getHoeheSitz(){
        return hoeheSitz;
    }
    //SET
    public void sethoeheSitz(double hoeheSitz){
        this.hoeheSitz = hoeheSitz;
    }

    @Override
    public String toString(){
        String ausgabe;
        ausgabe ="\nInventarnr: " + getInventarNr();
        ausgabe += "\nBezeichnung: " + getBezeichnung();
        ausgabe += "\nBeschreibung: " + getBeschreibung();
        ausgabe += "\nMaterial: " + getMaterial();
        ausgabe += "\nGewicht: " + getGewicht();
        ausgabe += "\nSitzhöhe: " + getHoeheSitz();
        return ausgabe;
    }
}
