package hometask_8_2_Task_3;
public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        SupplyContract supplyContract = new SupplyContract(123, "2011-06-22","doc", 11);
        ContractWithEmployee contractWithEmployee = new ContractWithEmployee(124, "2019-02-30", 23, "Ivan");
        FinancialInvoice financialInvoice = new FinancialInvoice(125, "2021-03-01", 222, 33);

        register.savingDocument(supplyContract);
        System.out.println();
        register.providingInformation(supplyContract);
        System.out.println("--------------------------------------------------------");
        register.savingDocument(contractWithEmployee);
        System.out.println();
        register.providingInformation(contractWithEmployee);
        System.out.println("--------------------------------------------------------");
        register.savingDocument(financialInvoice);
        System.out.println();
        register.providingInformation(financialInvoice);
    }
}
