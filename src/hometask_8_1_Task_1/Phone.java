package hometask_8_1_Task_1;
import java.util.Arrays;
public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this(number, model, 0);
    }
    public Phone(){}
    public String getNumber() {
        return number;
    }

    public String toString(){
        return "Phone number: " + this.number +
                "\nPhone model: " + this.model +
                "\nPhone weight: " + this.weight;
    }
    public String receiveCall(String name){
        return "Calls " + name;
    }
    public String receiveCall(String name, int number){
        return "Calls " + name +
                "\nPhone number: " + number;
    }
    public String sendMessage(String ...number){
        return "The message is sent to the phone number: " + Arrays.toString(number);
    }
}
