public class Spielfigur {

    private String name;
    private int staerkepunte;


    public Spielfigur (String name, int staerkepunte) {
        this.name = name;
        this.staerkepunte = staerkepunte;

    }

    public void laufen() {
        System.out.println(name +"läuft");
        this.staerkepunte -= 1;
    }

    public void klettern() {
        System.out.println(name +"klettert");
        this.staerkepunte -= 2;
    }

    public void kaempfen() {
        System.out.println(name +"kämpft");
        this.staerkepunte -= 3;
    }

    public String getName() {
        return this.name;
    }

    public int getStaerkepunkte() {
        return this.staerkepunte;
    }

    @Override
    public String toString() {
        String text = "\nName: "  + getName();
        text = text + "\nStärkepunkte: " +getStaerkepunkte();
        return text;
    }
}







