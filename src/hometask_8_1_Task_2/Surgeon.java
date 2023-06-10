package hometask_8_1_Task_2;
public class Surgeon extends Doctor {
    public Surgeon(String name, int experience, String post, int workingHours) {
        super(name, experience, post, workingHours);
    }
    public String toString(){
        return "Your doctor: \n" +
                "Name surgeon: " + super.getName()+
                "\nSurgeon's experience: " + super.getExperience() +
                "\nPosition of the surgeon: " + super.getPost() +
                "\nSurgeon's working hours per week: " + super.getWorkingHours();
    }
    public String toHeal(){
        return "Treatment plan: stop the bleeding and set the leg\n";
    }
}
