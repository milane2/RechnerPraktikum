public class MoebelNichtGefundenExeption extends Exception {

    private String inventarNr;

    public MoebelNichtGefundenExeption(String getInventarNr){

    }
    public String getInventarNr(){
        return inventarNr;
    }
    public String getMessage(){
        return "Das Möbelstück mit der Inventarnummer:"+ this.inventarNr + "konnte nicht gefunden werden! ";
    }
}
