package hometask_8_2_Task_3;

public class SupplyContract extends Document{
    private String typeOfGoods;
    private int numberOfProducts;
    public SupplyContract(){}
    public SupplyContract(int documentNumber, String documentDate, String typeOfGoods, int numberOfProducts) {
        super(documentNumber, documentDate);
        this.typeOfGoods = typeOfGoods;
        this.numberOfProducts = numberOfProducts;
    }

    @Override
    public void getInfo() {
        super.getInfo();
                System.out.println("Type of goods: " + this.typeOfGoods +
                "\nNumber of products: " + this.numberOfProducts);
    }
}
