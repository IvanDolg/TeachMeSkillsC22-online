public class Registration {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final UserStorage storage = new FileUserStorage();
    private User user;

    public void singUp(){
        writer.write("Enter your login: ");
        String newLogin = reader.redType();
        writer.write("Enter your password: ");
        String newPassword = reader.redType();

        user = new User(newLogin, newPassword);
        storage.save(user);

        writer.write("Welcome " + user.getLogin() + "\n");
    }
}
