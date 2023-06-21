package hometask_8_2_Task_3;

public class FinancialInvoice extends Document{
    private int totalAmountForTheMonth;
    private int departmentCode;
    public FinancialInvoice () {}
    public FinancialInvoice(int documentNumber, String documentDate, int totalAmountForTheMonth, int departmentCode) {
        super(documentNumber, documentDate);
        this.totalAmountForTheMonth = totalAmountForTheMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Total amount for the month: " + this.totalAmountForTheMonth +
                "\nDepartment code: " + this.departmentCode);
    }
}
