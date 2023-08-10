package Task_2;

import java.io.File;
import java.util.List;

public interface FileReaderService {
    List<File> getFiles(String folderPath);
    List<String> readLinesFromFile(File file);
}