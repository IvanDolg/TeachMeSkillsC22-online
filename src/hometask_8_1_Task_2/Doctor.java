package hometask_8_1_Task_2;
public abstract class Doctor {
    private String name;
    private int experience;
    private String post;
    private int workingHours;
    public Doctor(String name, int experience, String post, int workingHours){
        this.name = name;
        this.experience = experience;
        this.post = post;
        this.workingHours = workingHours;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }
    public String getPost() {
        return post;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public abstract String toString();
    public abstract String toHeal();
}
