package Task_1;

import Task_1.Exception.BeginningOfTheLine;
import Task_1.Exception.DocNumException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OutputDocNumver {
    public static void getOutputStream(){
        File path = new File("src/Task_1/Doc.txt");

        System.out.println("Data from the file: ");
        try (Scanner docScanner = new Scanner(path)){
            while (docScanner.hasNext()) {
                try {
                    String line = docScanner.nextLine();
                    if (DocNumberFileMistakes.CheckingForTheNumberOfLetters(line) && DocNumberFileMistakes.validationCheck(line)){
                        System.out.println(line);
                    }
                } catch (BeginningOfTheLine e) {
                        throw new RuntimeException(e);
                } catch (DocNumException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
