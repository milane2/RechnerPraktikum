public class Torwart extends Spieler {

    private int reaktion;

    public Torwart (String name, int alter, int staerke, int motiation, int reaktion){
        super(name,alter,staerke,0,motiation,0);
        this.reaktion = reaktion;
    }
    public int getReaktion(){
        return  reaktion;
    }
    public void setReaktion(){
        this.reaktion = reaktion;
    }
}

