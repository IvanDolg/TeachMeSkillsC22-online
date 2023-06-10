package hometask_8_1_Task_2;
public class Clinic {
    private String clinicName;
    private Patient patient;

    public Clinic(String clinicName, Patient patient){
        this.clinicName = clinicName;
        this.patient = patient;
    }
    public String toString(){
        return "Clinic name: " + this.clinicName +
                "\n--------------------------------" +
                this.patient +
                "\n--------------------------------";
    }
}
