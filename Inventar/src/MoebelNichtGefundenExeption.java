public class MoebelNichtGefundenExeption extends Exception {

    private String inventarNr;

    public MoebelNichtGefundenExeption(String getInventarNr){

    }
    public String getInventarNr(){
        return inventarNr;
    }
    public String getMessage(){
        return "Die Inventarnummer konnte nicht gefunden werden! ";
    }
}
