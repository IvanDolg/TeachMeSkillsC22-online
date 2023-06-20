package hometask_8_2_Task_2;
public class Worker extends Employee{
    public Worker(String employeeName, int age, String employeeCity, String post) {
        super(employeeName, age, employeeCity, post);
    }

    @Override
    public void getPosition() {
        System.out.println(super.getEmployeeName() + " refers to the " + super.getPost());
    }
}
