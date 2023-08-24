import java.io.*;
public class Identification {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    public void loginIn(){
        File file = new File("src/DocFile/Session.txt");

        writer.write("Enter your login: ");
        String login = reader.redType();
        writer.write("Enter your password: ");
        String password = reader.redType();

        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] path = line.split(":");
                String registeredLogin = path[0];
                String registeredPassword = path[1];

                if (path.length == 2 && registeredLogin.equals(login) && registeredPassword.equals(password)){
                    writer.write("Welcome " + login + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
