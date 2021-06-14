public class MoebelNichtGefundenExeption extends Exception {

    public MoebelNichtGefundenExeption(){

    }

    public String getMessage(){
        return "Inventarnummer konnte nicht gefunden werden! ";
    }
}
