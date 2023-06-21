package hometask_8_2_Task_3;

public class ContractWithEmployee extends Document{
    private int contractEndDate;
    private String employeeName;
    public ContractWithEmployee(int documentNumber, int documentDate, int contractEndDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Contract end date: " + this.contractEndDate +
                "\nEmployee's name: " + this.employeeName);
    }
}
