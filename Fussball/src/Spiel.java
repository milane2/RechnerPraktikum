public class Spiel {

    private int name;
    private Mannschaft heimMannschaft;
    private Mannschaft gastMannschaft;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(int name,Mannschaft heimMannschaft,Mannschaft gastMannschaft,Ergebnis ergebnis,StringBuilder spielverlauf){

        this.name = name;
        this.heimMannschaft = heimMannschaft;
        this.gastMannschaft = gastMannschaft;
        this.ergebnis = ergebnis;
        this.spielverlauf = spielverlauf;
    }

    public int getName(){

        return name;
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

}