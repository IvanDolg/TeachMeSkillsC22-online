package hometask_8_1_Task_2;
public class Dentist {
    private String name;
    private int experience;
    private String post;
    private int workingHours;
    public Dentist(String name, int experience, String post, int workingHours){
        this.name = name;
        this.experience = experience;
        this.post = post;
        this.workingHours = workingHours;
    }
    public String toString(){
        return "\nName dentist: " + this.name +
                "\nDentist's experience: " + this.experience +
                "\nPosition of the dentist: " + this.post +
                "\nDentist's working hours per week: " + this.workingHours;
    }
    public String toHeal(){
        return "Find a bad tooth, clean and seal it";
    }
}
