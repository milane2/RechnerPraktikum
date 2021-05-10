public abstract class Person {

    private String name;
    private int alter;

    public Person (String name, int alter) {
        this.name = name;
        this.alter = alter;
    }
    public String getName(){
        return  name;
    }
    public void setName() {
        this.name = name;
    }
    public int getAlter(){
        return  alter;
    }
    public void setAlter() {
        this.alter = alter;
    }
}