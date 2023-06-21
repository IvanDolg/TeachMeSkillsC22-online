package hometask_8_2_Task_3;

public class Register implements RegisterMethods {
    Document[] documents = new Document[10];
    private int index;
    @Override
    public String savingDocument(Document document) {
       if (documents.length != index){
           System.out.println("The data was recorded");
       }else {
           System.out.println("No data was recorded");
       }
        return null;
    }
    @Override
    public void providingInformation(Document document) {
        document.getInfo();
    }
}
