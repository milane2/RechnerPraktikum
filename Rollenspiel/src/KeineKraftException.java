public class KeineKraftException extends Exception{


    private String name;
    private String aktion;

    public KeineKraftException(String name, String aktion){
        this.name = name;
        this.aktion = aktion;
    }
public String getMessage(){
        String meldung = name +" hat keine Kraft für " + aktion + "mehr!";
        return meldung;
}

}
