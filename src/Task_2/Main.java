package Task_2;

import Task_2.Exception.IncorrectLoginException;
import Task_2.Exception.IncorrectPasswordException;

public class Main {
  public static void main(String[] args) {

      try {
          ExceptionOutput.checkLogin("IvanDol");
      } catch (IncorrectLoginException e) {
          throw new RuntimeException(e);
      }

      try {
          ExceptionOutput.checkPassword("ivan2004");
      } catch (IncorrectPasswordException e) {
          throw new RuntimeException(e);
      }
  }
}
