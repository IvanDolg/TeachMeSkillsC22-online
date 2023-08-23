import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Identification {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final UserStorage storage = new FileUserStorage();
    public void loginIn(){
        File file = new File("src/DocFile/Session.txt");

        writer.write("Enter your login: ");
        String login = reader.redType();
        writer.write("Enter your password: ");
        String password = reader.redType();

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] path = line.split(":");
                String registeredLogin = path[0];
                String registeredPassword = path[1];

                for (int i = 0; i < storage.findAll().size(); i++) {
                    if (registeredLogin.equals(login) && registeredPassword.equals(password)){
                        writer.write("Welcome " + login + "\n");
                        storage.findAll();
                    } else writer.write("Enter correct login || password\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
