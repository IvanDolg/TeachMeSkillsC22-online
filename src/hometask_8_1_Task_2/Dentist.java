package hometask_8_1_Task_2;
public class Dentist extends Doctor{
    public Dentist(String name, int experience, String post, int workingHours) {
        super(name, experience, post, workingHours);
    }
    public String toString(){
        return "Your doctor \n" +
                "Name dentist: " + super.getName() +
                "\nDentist's experience: " + super.getExperience() +
                "\nPosition of the dentist: " + super.getPost() +
                "\nDentist's working hours per week: " + super.getWorkingHours();
    }
    public String toHeal(){
        return "Treatment plan: find a bad tooth, clean and seal it\n";
    }
}
