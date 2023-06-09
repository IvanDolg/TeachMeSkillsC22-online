package hometask_8_1_Task_2;
public class Surgeon {
    private String name;
    private int experience;
    private String post;
    private int workingHours;
    public Surgeon(String name, int experience, String post, int workingHours){
        this.name = name;
        this.experience = experience;
        this.post = post;
        this.workingHours = workingHours;
    }
    public String toString(){
        return "\nName surgeon: " + this.name +
                "\nSurgeon's experience: " + this.experience +
                "\nPosition of the surgeon: " + this.post +
                "\nSurgeon's working hours per week: " + this.workingHours;
    }
    public String toHeal(){
        return "Stop the bleeding and set the leg";
    }
}
