package Task_1;

import Task_1.Exception.CounterException;

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    private static void MyMenu(){
        System.out.print("\n1) Add a new file" +
                "\n2) Add a new line to file" +
                "\n3) Validation check" +
                "\n4) Output file information" +
                "\n5) Delete file" +
                "\n6) Exit" +
                "\n\nEnter what you want to do: ");
    }
    private static void SaveFile(){
        System.out.print("Enter file name: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1/DocPacage";
        File file = new File(folderPath, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File " + fileName + " successfully created");
            } else {
                System.out.println("The file with name " + fileName + " already exists");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void DeleteFile() {
        System.out.print("Enter file name to delete: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1/DocPacage";

        File file = new File(folderPath, fileName);
        if (file.delete()) {
            System.out.println("File " + fileName + " deleted successfully");
        } else {
            System.out.println("Failed to delete file with name: " + fileName);
        }
    }
    private static void AddDataToFile() {
        System.out.print("\nWrite the name of the file you wont to save the data to: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1/DocPacage";
        File file = new File(folderPath, fileName);

        HashSet <String> hashSet = new HashSet<>();

        System.out.print("\nEnter the number of data rows: ");
        int amountOfData = scanner().nextInt();

        System.out.println("\nEnter the data: ");
        for (int i = 0; i < amountOfData; i++) {
            hashSet.add(scanner().nextLine());
        }
        try (FileWriter fileWriter = new FileWriter(file, true)){
            for (String print : hashSet){
                fileWriter.write(print + "\n\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void ReadInformation() {
        System.out.print("\nWrite the name of the file you wont to read: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1/DocPacage";
        File file = new File(folderPath, fileName);

        System.out.println("\nYour data: ");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static void CleanFile(){
        try {
            PrintWriter printWriter = new PrintWriter("src/Task_1/DocPacage/ValidStrings.txt");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter printWriter = new PrintWriter("src/Task_1/DocPacage/InvalidStrings.txt");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void ValidationCheck() {
        System.out.print("\nWrite the name of the file you want to check for validity: ");
        String fileName = scanner().nextLine();

        String folderPath = "src/Task_1/DocPacage";
        String validStrings = "src/Task_1/DocPacage/ValidStrings.txt";
        String invalidStrings = "src/Task_1/DocPacage/InvalidStrings.txt";

        File file = new File(folderPath, fileName);

        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                try {
                    String line = scanner.nextLine();
                    if (DocNumberFileMistakes.checkValid(line) && DocNumberFileMistakes.numberCheck(line)) {
                        map.put(line, " - valid");
                        try (PrintWriter writer = new PrintWriter(validStrings)) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                writer.println(entry.getKey() + entry.getValue());
                            }
                        }
                    } else {
                            try (PrintWriter writer = new PrintWriter(invalidStrings)) {
                                writer.flush();
                                map1.put(line, " - invalid");
                                for (Map.Entry<String, String> entry : map1.entrySet()) {
                                    writer.println(entry.getKey() + entry.getValue());
                                }
                            }
                        }
                    } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Check File (ValidStrings && InvalidString)");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        public static void main(String[] args) throws CounterException, IOException {
        CleanFile();
        while (true) {
            MyMenu();
            int counter = scanner().nextInt();

            switch (counter) {
                case 1:
                    SaveFile();
                    break;
                case 2:
                    AddDataToFile();
                    break;
                case 3:
                    ValidationCheck();
                    break;
                case 4:
                    ReadInformation();
                    break;
                case 5:
                    DeleteFile();
                    break;
                case 6:
                    System.out.println("End of the program");
                    System.exit(0);
                    break;
                default:
                    DocNumberFileMistakes.NumberCheck(counter);
            }
        }
    }
}
