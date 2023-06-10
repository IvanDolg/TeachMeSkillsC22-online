package hometask_8_1_Task_2;
public class Patient {
    private String name;
    private int age;
    private int weight;
    public Patient(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString(){
        return "\nPatient name: " + this.name +
                "\nPatient's age: " + this.age +
                "\nPatient's weight: " + this.weight;
    }
}
