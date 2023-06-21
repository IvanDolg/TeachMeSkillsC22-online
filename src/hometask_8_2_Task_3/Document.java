package hometask_8_2_Task_3;
import java.text.SimpleDateFormat;

public abstract class Document {
    private int documentNumber;
    private String  documentDate;
    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
    public Document(){}
    public Document(int documentNumber, String ft){
        this.documentNumber = documentNumber;
        this.documentDate = ft;
    }
    public int getDocumentNumber() {
        return documentNumber;
    }
    public String getDocumentDate() {
        return documentDate;
    }
    public void getInfo(){
        System.out.println("Document number: " + this.documentNumber +
                "\nDocument date: " + this.documentDate);
    }
}
