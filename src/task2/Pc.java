package task2;
public class Pc {
    private int price;
    private String model;
    private HDD hdd;
    private RAM ram;
    public Pc (int price, String model){
        this( price, model, new HDD(), new RAM() );
    }
    public Pc (int price, String model, HDD hdd, RAM ram){
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }
    public int getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }

    public String toString(){
        return "Price: " + getPrice() +
                "\nModel: " + getModel() +
                "\nHdd " + this.hdd +
                "\nRam " + this.ram;
    }
}
