package hometask_8_1_Task_2;
public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Mic", 29, 75);

        Clinic clinic = new Clinic("St. Joseph's Clinic", patient);
        System.out.println(clinic);

        TreatmentPlan treatmentPlan = new TreatmentPlan(2);
        treatmentPlan.setDoctor();
        System.out.println(treatmentPlan.getDoctor());

    }
}
