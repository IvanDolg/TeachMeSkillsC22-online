package hometask_8_1_Task_2;
public class Therapist extends Doctor {
    public Therapist(String name, int experience, String post, int workingHours) {
        super(name, experience, post, workingHours);
    }
    public String toString(){
        return "Your doctor: \n" +
                "Name therapist: " + super.getName() +
                "\nTherapist's experience: " + super.getExperience() +
                "\nPosition of the therapist: " + super.getPost() +
                "\nTherapist's working hours per week: " + super.getWorkingHours();
    }
    public String toHeal(){
        return "Treatment plan: check the temperature and prescribe medications\n";
    }
}
