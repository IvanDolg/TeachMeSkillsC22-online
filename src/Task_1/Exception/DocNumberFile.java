package Task_1.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocNumberFile {
    public static void getOutputStream(){
        File path = new File("src/Task_1/Doc.txt");

        try {
            Scanner docScanner = new Scanner(path);
            String firstLine = docScanner.nextLine();

            System.out.println(firstLine);

            while (docScanner.hasNext()){
                System.out.println(docScanner.nextLine());
            }

            docScanner.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
    }
}
