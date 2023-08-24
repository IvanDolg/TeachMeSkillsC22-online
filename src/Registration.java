public class Registration {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final UserStorage storage = new FileUserStorage();

    public void singUp(){
        writer.write("Enter your login: ");
        String newLogin = reader.redType();
        writer.write("Enter your password: ");
        String newPassword = reader.redType();
        writer.write("Enter your id: ");
        int id = Integer.parseInt(reader.redType());
        User user = new User(newLogin, newPassword, id);
        storage.save(user);

        writer.write("Welcome " + user.getLogin() + "\n");
    }
}
