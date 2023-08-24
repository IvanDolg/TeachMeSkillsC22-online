import java.util.List;

public class Application {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final OperationService operationService = new OperationService();
    private final Registration registration = new Registration();
    private final Identification identification = new Identification();
    private  boolean cond = true;
    public void start(){
        while (cond) {
                autorizationMenu();
                //userMenu();
        }
    }
    private void userMenu(){
        while (true){
            operationService.newOperation();
            writer.write("\nResume? \n1 - Yes, \n2 - No, \n3 - show history\nYour choice: ");
            double answer = reader.readNumber();
            if (answer == 2){
                break;
            }
            if (answer == 3){
                List<String> history = operationService.getHistory();
                for (String operationHistory : history){
                    writer.write(operationHistory);
                }
                break;
            }
        }
    }
    private void autorizationMenu() {
        boolean condition = true;
        while (condition){
            writer.write("1) Sign up");
            writer.write("\n2) Log in");
            writer.write("\n3) Exit");
            writer.write("\nChoose your action: ");
            int action = (int) reader.readNumber();
            switch (action){
                case 1:
                   registration.singUp();
                    userMenu();
                    break;
                case 2:
                    identification.loginIn();
                    userMenu();
                    break;
                case 3:
                    condition = false;
                    cond = false;
                    break;
                default:
                    writer.write("Enter correct number) ");
                    break;
            }
        }
    }
}

