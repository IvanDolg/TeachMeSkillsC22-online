package hometask_8_1_Task_2;
public class Therapist {
    private String name;
    private int experience;
    private String post;
    private int workingHours;
    public Therapist(String name, int experience, String post, int workingHours){
        this.name = name;
        this.experience = experience;
        this.post = post;
        this.workingHours = workingHours;
    }
    public String toString(){
        return "\nName therapist: " + this.name +
                "\nTherapist's experience: " + this.experience +
                "\nPosition of the therapist: " + this.post +
                "\nTherapist's working hours per week: " + this.workingHours;
    }
    public String toHeal(){
        return "Check the temperature and prescribe medications";
    }
}
