package task2;
public class HDD {
    private String name;
    private int volume;
    private String type;

    public HDD(String name, int volume, String type){
        this.name = name;
        this.volume = volume;
        this.type = type; // external or internal
    }
    public HDD(){}
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public String getType() {
        return type;
    }
    public String toString(){
        return "name: " + getName() +
                "\nVolume: " + getVolume() +
                "\nType: " + getType();
    }
}
