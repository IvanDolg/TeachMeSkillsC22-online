package hometask_8_2_Task_2;
public class Accountant extends Employee{
    public Accountant(String employeeName, int age, String employeeCity, String post) {
        super(employeeName, age, employeeCity, post);
    }

    @Override
    public void getPosition() {
        System.out.println(super.getEmployeeName() + " refers to the " + super.getPost());
    }
}
