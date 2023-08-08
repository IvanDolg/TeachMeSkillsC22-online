package Task_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCheck {
    Map<String, Document>  map = new HashMap<>();
    public void validDocFileCheck (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter folder path: ");
        String part = scanner.nextLine();

        System.out.println("List of .txt files");
        File file = new File(part);

        for (File file1 : file.listFiles()){
            System.out.println(file1.getName());
        }
        File[] files = file.listFiles();

        String regexp = "^\\+\\(\\d{2}\\)\\d{7}$";
        String regexp1 = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String regexp2 = "\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d[a-zA-Zа-яА-Я]\\d[a-zA-Zа-яА-Я]";

        Pattern pattern = Pattern.compile(regexp);
        Pattern pattern1 = Pattern.compile(regexp1);
        Pattern pattern2 = Pattern.compile(regexp2);

        System.out.print("Enter the number of documents to process: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (files != null && files.length > 0) {


            for (int i = 0; i < num; i++) {
                Document document = new Document();
                List <String> list = new ArrayList<>();
                File file1 = files[i];
                if (file1.isFile()) {

                    String fileName = file1.getName();
                    String documentName = fileName.substring(0, fileName.lastIndexOf('.'));

                    try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                        String line;

                        while ((line = reader.readLine()) != null) {

                            Matcher matcher = pattern.matcher(line);
                            Matcher matcher1 = pattern1.matcher(line);
                            Matcher matcher2 = pattern2.matcher(line);

                            if (matcher.find()){
                                String match = matcher.group();
                                document.setPhoneNum(match);
                            }
                            if (matcher1.find()){
                                String match1 = matcher1.group();
                                document.setEmail(match1);
                            }
                            if (matcher2.find()){
                                String match2 = matcher2.group();
                                list.add(match2);
                                document.setContractNum(list.toString());
                            }
                            map.put(documentName, document);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } else System.out.println("The folder does not contain any files.");
    }

    public void showValidDoc() {System.out.println(map);}
}
