public class Spiel {

    private Mannschaft heimMannschaft;
    private Mannschaft gastMannschaft;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft heimMannschaft,Mannschaft gastMannschaft,Ergebnis ergebnis,StringBuilder spielverlauf){

        this.heimMannschaft = heimMannschaft;
        this.gastMannschaft = gastMannschaft;
        this.ergebnis = ergebnis;
        this.spielverlauf = spielverlauf;
    }
    public Mannschaft getHeimMannschaft(){
        return  heimMannschaft;
    }
    public Mannschaft getGastMannschaft(){
        return  gastMannschaft;
    }
    public Ergebnis getErgebnis(){
        return  ergebnis;
    }
    public StringBuilder getSpielverlauf(){
        return  spielverlauf;
    }
    public String toString(){
        String ausgabe;
        ausgabe ="\nHeimMannschaft: " + getHeimMannschaft();
        ausgabe += "\nGastMannschaft: " + getGastMannschaft();
        ausgabe += "\nErgebnis: " + getErgebnis();
        ausgabe += "\nSpielverlauf: " + getSpielverlauf();
        return ausgabe;
    }
}