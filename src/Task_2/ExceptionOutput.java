package Task_2;

import java.util.Scanner;

import Task_2.Exception.IncorrectLoginException;
import Task_2.Exception.IncorrectPasswordException;

public class ExceptionOutput {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    static void checkLogin(String login) throws IncorrectLoginException {

        System.out.print("Please enter a Login to proceed: ");
        String myLogin = scanner().nextLine();

        if (myLogin.length() > 20){
            throw new IncorrectLoginException("Your password is too long: " + myLogin.length());
        }
        if (myLogin.contains(" ")){
            throw new IncorrectLoginException("There are spaces in your login: " + myLogin);
        }
        if (!myLogin.toLowerCase().equals(login.toLowerCase())) {
            throw new IncorrectLoginException("You have entered wrong login: " + myLogin);
        } else {
            System.out.println("Your login: " + myLogin);
        }
    }
    static void checkPassword(String password) throws IncorrectPasswordException{

        System.out.println("Please enter a Password to proceed: ");
        String myPassword = scanner().nextLine();

        if (myPassword.matches("[a-zA-Z]+")){
            throw new IncorrectPasswordException("There are no numbers in your password: " + myPassword);
        }
        if (myPassword.length() > 20){
            throw new IncorrectPasswordException("Your password is too long: " + myPassword.length());
        }
        if (myPassword.contains(" ")){
            throw new IncorrectPasswordException("There are spaces in your password: " + myPassword);
        }
        if (!myPassword.equals(password)){
            throw new IncorrectPasswordException("You have entered wrong password: " + myPassword);
        } else {
            System.out.println("Your password: " + myPassword);
        }
    }
}
