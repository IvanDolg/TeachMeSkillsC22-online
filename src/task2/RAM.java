package task2;
public class RAM {
    private String name;
    private int volume;
    public RAM (String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public RAM(){}
    public String toString(){
        return "name: " + getName() +
                "\nVolume: " + getVolume();
    }
}
