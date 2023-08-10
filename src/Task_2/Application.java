package Task_2;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter folder path: ");
        String part = scanner.nextLine();

        System.out.println("List of .txt files");
        File file = new File(part);

        for (File file1 : file.listFiles()){
            System.out.println(file1.getName());
        }

        System.out.print("Enter the number of documents to process: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        Validator validator = new Validator();
        Map<String, Document> documentMap = validator.processDocuments(part, num);

        System.out.println("\nMap output: ");
        System.out.println(documentMap);
    }
}
