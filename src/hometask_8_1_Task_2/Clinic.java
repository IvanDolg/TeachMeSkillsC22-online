package hometask_8_1_Task_2;

public class Clinic {
    private String clinicName;
    private Surgeon surgeon;
    private Therapist therapist;
    private Dentist dentist;
    private Patient patient;
    public Clinic(String clinicName, Surgeon surgeon, Therapist therapist, Dentist dentist, Patient patient){
        this.clinicName = clinicName;
        this.surgeon = surgeon;
        this.therapist = therapist;
        this.dentist = dentist;
        this.patient = patient;
    }
    public String toString(){
        return "Clinic name: " + this.clinicName +
                "\n--------------------------------" +
                this.surgeon +
                "\n--------------------------------" +
                this.therapist +
                "\n--------------------------------" +
                this.surgeon +
                "\n--------------------------------" +
                this.patient;
    }
}
