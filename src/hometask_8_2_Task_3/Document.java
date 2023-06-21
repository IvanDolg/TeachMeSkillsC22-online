package hometask_8_2_Task_3;

public abstract class Document {
    private int documentNumber;
    private int  documentDate;
    public Document(int documentNumber, int documentDate){
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
    public int getDocumentNumber() {
        return documentNumber;
    }
    public int getDocumentDate() {
        return documentDate;
    }
    public void getInfo(){
        System.out.println("Document number: " + this.documentNumber +
                "\nDocument date: " + this.documentDate);
    }
}
