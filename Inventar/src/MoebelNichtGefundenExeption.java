public class MoebelNichtGefundenExeption extends Exception {

    private String inventarNr;

    public MoebelNichtGefundenExeption(String getInventarNr){

    }
    public String getInventarNr(){
        return inventarNr;
    }
    public String getMessage(){
        return "Inventarnummer konnte nicht gefunden werden! ";
    }



}
