package hometask_8_1_Task_2;
public class Patient {
    private String name;
    private int age;
    private int weight;
    protected int nameOfTheDisease;
    public Patient(String name, int age, int weight, int nameOfTheDisease){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nameOfTheDisease = nameOfTheDisease;
    }
    public String toString(){
        return "Patient name: " + this.name +
                "Patient's age: " + this.age +
                "Patient's weight: " + this.weight +
                "Patient's disease: " + this.nameOfTheDisease;
    }
}
