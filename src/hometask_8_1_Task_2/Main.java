package hometask_8_1_Task_2;

public class Main {
    public static void main(String[] args) {

        Surgeon surgeon = new Surgeon("Nick", 10,  "deputy of the department", 65);
        Therapist therapist = new Therapist("Mike", 3, "doctor", 130);
        Dentist dentist = new Dentist("Liz", 2, "doctor", 100);
        Patient patient = new Patient("Mic", 29, 75, 1);

        Clinic clinic = new Clinic("St. Joseph's Clinic", surgeon, therapist, dentist, patient);

        System.out.println(clinic);
    }
    // Создать программу для имитации работы клиники.
    //Пусть в клинике будет три врача: хирург, терапевт и дантист.
    //Так же предусмотреть класс «Пациент» и класс «План лечения».

    //Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
    //Создать объект класса «Пациент» и добавить пациенту план лечения.
    //Так же создать метод, который будет назначать врача пациенту согласно
    //плану лечения.
    //Если план лечения имеет код 1 – назначить хирурга и выполнить метод
    //лечить.
    //Если план лечения имеет код 2 – назначить дантиста и выполнить метод
    //лечить.
    //Если план лечения имеет любой другой код – назначить терапевта и
    //выполнить метод лечить.
}
