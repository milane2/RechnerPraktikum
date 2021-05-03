public class Ergebnis {

    int toreHeim;
    int toreGast;

    public Ergebnis(){
        this.toreGast = 0;
        this.toreHeim = 0;
    }
    public int getToreGast() {
        return this.toreGast;
    }
    public int getToreHeim() {
        return this.toreHeim;
    }
    public int addToreGast() {
        return this.toreGast++;
    }
    public int addToreHeim() {
        return this.toreHeim++;
    }

    public String toString(){
        String ausgabe;
        ausgabe ="\nTorHeim: " + getToreHeim();
        ausgabe += "\nTorGast: " + getToreGast();
        return ausgabe;
    }
}