public class Trainer extends Person{

    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung ){
        super(name, alter);
        this.erfahrung = erfahrung;
    }
    public int getErfahrung(){
        return  erfahrung;
    }
    public void seterfahrung() {
        this.erfahrung = erfahrung;
    }
}