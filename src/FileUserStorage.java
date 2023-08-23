import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUserStorage implements UserStorage{
    File file = new File("src/DocFile/Session.txt");
    @Override
    public void save(User user) {

        if (!file.exists()) {

        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(user.toString());
            fileWriter.write(10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<String> findAll(){
        List <String> users = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                String user1 = scanner.nextLine();
                users.add(user1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
