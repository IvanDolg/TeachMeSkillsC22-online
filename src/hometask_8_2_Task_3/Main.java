package hometask_8_2_Task_3;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        SupplyContract supplyContract = new SupplyContract(123, "2011-06-22","doc", 11);
        ContractWithEmployee contractWithEmployee = new ContractWithEmployee(124, "2019-02-30", 23, "Ivan");
        FinancialInvoice financialInvoice = new FinancialInvoice(125, "2021-03-01", 222, 33);

        register.providingInformation(supplyContract);
        System.out.println("--------------------------------------------------------");
        register.providingInformation(contractWithEmployee);
        System.out.println("--------------------------------------------------------");
        register.providingInformation(financialInvoice);
    }
    //3 Создать систему для учета документов. Создать класс Регистр, который будет иметь методы:
    //- сохранения документа в регистре
    //- предоставление информации о документе

    //- Класс регистр должен содержать внутри себя массив и при добавлении документа
    //в регистр этот добавляемый документ должен добавляться в массив;
    //- Массив для класса регистра должен быть размером 10;

    // В этом методе напишите код для создания каждого из типов
    // документов, добавления их в регистр и вывода информации о документе;
}
