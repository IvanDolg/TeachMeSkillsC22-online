package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputDocNumver {
    private static StringBuilder validNumbers = new StringBuilder();
    private static StringBuilder invalidNumbers = new StringBuilder();
    public static void getOutputStream(){

        File path = new File("src/Task_2/DocFile/Doc.txt");
        File path1 = new File("src/Task_2/DocFile/NewDoc.txt");
        File path2 = new File("src/Task_2/DocFile/NewDoc1");


        System.out.println("\n\t\t\tCheck the files !!!");
        try (Scanner docScanner = new Scanner(path)){
            while (docScanner.hasNext()) {
                String line = docScanner.nextLine();
                if (DocNumberFileMistakes.checkValid(line) && DocNumberFileMistakes.numberCheck(line)){
                    validNumbers.append(line).append("\n");
                }else {
                    if (line.length() != 15){
                        invalidNumbers.append(line + " - the length of each line is only 15 characters)\n");
                    } else if (!line.startsWith("docnum") || !line.startsWith("contract")) {
                        invalidNumbers.append(line + " - each line should start with 'docnum' && 'contract'\n");
                    }
                }
            }
            writeToFile(path1, validNumbers.toString());
            writeToFile(path2, invalidNumbers.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeToFile(File toRightData, String line){
        try (PrintWriter printWriter = new PrintWriter(toRightData)){
            printWriter.write(line);
            printWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
