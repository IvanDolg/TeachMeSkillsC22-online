package Task_2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private final FileReaderService fileReaderService = new InMemoryFileReaderService();

    private final Pattern phonePattern = Pattern.compile("^\\+\\(\\d{2}\\)\\d{7}$");;
    private final Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");;
    private final Pattern contractNumPattern = Pattern.compile("\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d[a-zA-Zа-яА-Я]\\d[a-zA-Zа-яА-Я]");;

    public Map<String, Document> processDocuments(String folderPath, int num) {
        Map<String, Document> documentMap = new HashMap<>();

        List<File> files = fileReaderService.getFiles(folderPath);

        for (int i = 0; i < num && i < files.size(); i++) {

            File file = files.get(i);
            List<String> lines = fileReaderService.readLinesFromFile(file);

            Document document = new Document();
            List<String> contractNums = new ArrayList<>();

            for (String line : lines) {
                Matcher phoneMatcher = phonePattern.matcher(line);
                Matcher emailMatcher = emailPattern.matcher(line);
                Matcher contractMatcher = contractNumPattern.matcher(line);

                if (phoneMatcher.find()) {
                    String phoneNum = phoneMatcher.group();
                    document.setPhoneNum(phoneNum);
                }
                if (emailMatcher.find()) {
                    String email = emailMatcher.group();
                    document.setEmail(email);
                }
                if (contractMatcher.find()) {
                    String contractNum = contractMatcher.group();
                    contractNums.add(contractNum);
                    document.setContractNum(contractNums.toString());
                }
            }

            String documentName = file.getName().substring(0, file.getName().lastIndexOf('.'));
            documentMap.put(documentName, document);
        }
        return documentMap;
    }
}
