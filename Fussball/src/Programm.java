public class Programm {

    public static void main(String[] args) {

        Trainer trainer1 = new Trainer("Nili marus",32,3);
        System.out.println(); trainer1.getName();
        trainer1.setName();

        Spieler spieler1 = new Spieler("Nisu metarus",32,3,5,3,7);
        System.out.println(); spieler1.getName();
        spieler1.setName();

        Torwart torwart1 = new Torwart("Nicom arusi",22,6,8,5);
        System.out.println(); torwart1.getName();
        torwart1.setName();

        Mannschaft MannschaftHeim = new Mannschaft();
        System.out.println(); MannschaftHeim.getName();
        MannschaftHeim.setName();

        Mannschaft MannschaftGast = new Mannschaft();
        System.out.println(); MannschaftGast.getName();
        MannschaftGast.setName();











    }
}