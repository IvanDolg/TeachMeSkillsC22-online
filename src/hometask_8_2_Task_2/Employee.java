package hometask_8_2_Task_2;
public abstract class Employee implements Data {
    private String employeeName;
    private int age;
    private String employeeCity;
    private String post;
    public Employee(String employeeName, int age, String employeeCity, String post){
        this.employeeName = employeeName;
        this.age = age;
        this.employeeCity = employeeCity;
        this.post = post;
    }
    public String getPost() {
        return post;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------" +
                "\nEmployee name: " + this.employeeName +
                "\nEmployee age: " + this.age +
                "\nEmployee city: " + this.employeeCity;
    }
}
