package hometask_8_1_Task_2;
public class TreatmentPlan {
    private int number;
    private Doctor doctor;
    public TreatmentPlan(int number){
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor() {
        if (getNumber() == 1){
            doctor = new Surgeon ("Nick", 10,  "deputy of the department", 65);
            System.out.println(doctor.toHeal());
        }
        if (getNumber() == 2){
            doctor  = new Dentist("Liz", 2, "doctor", 100);
            System.out.println(doctor.toHeal());
        } else if (getNumber() > 2){
            doctor  = new Therapist("Mike", 3, "doctor", 130);
            System.out.println(doctor.toHeal());
        }
    }
}
