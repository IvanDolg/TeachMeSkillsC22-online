package hometask_8_2_Task_3;

public class Register implements RegisterMethods {
    private Document[] document = new Document[10];
    @Override
    public void savingDocument(Document document) {

    }

    @Override
    public void providingInformation(Document document) {
        document.getInfo();
    }
    //- сохранения документа в регистре
    //- предоставление информации о документе
}
