package Task_1;

import Task_1.Exception.CounterException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*      Вернемся к домашнему заданию занятия номер 12 и модифицируем его.

        Программа должна получать имена файлов с номерами документов с
        консоли:
        каждая новая строка - это путь к файлу и имя файла.
        Для завершения ввода списка файлов следует ввести 0.

        После получения списка документов программа должна обработать
        каждый документ:
        вычитать из файла номера документов и провалидировать их.

        В конце работы создать один файл отчет с выходной информаций:

        номер документа - комментарий(валиден или не валиден и по какой причине).

        Пусть каждый файл содержит каждый номер документа с новой строки и
        в строке никакой другой информации, только номер документа.

        Валидный номер документа должен иметь длину 15 символов и
        начинаться с последовательности docnum(далее любая
        последовательность букв/цифр) или kontract(далее любая
        последовательность букв/цифр).

        Учесть, что номера документов могут повторяться в пределах одного
        файла и так же разные документы могут содержать одни и те же номера
        документов.

        Если номера документов повторяются, то повторные номера документов
        не проверять, не валидировать.

        Немного технических деталей

        1) Считать с консоли список документов: раз список - то это коллекции
        типа List, никаких других условий нет - значит все имена файлов с
        консоли сохраняем в структуру данных ArrayList.

        2) Номера документов могут повторяться, но повторные документы
        обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты
        нам не нужны - значит, надо считать номера документов из файлов и все
        номера документов сохранять в коллекцию типа Set. Других условий нет,
        значит можно использовать HashSet.

        3) В конце должна быть структура номер документа - комментарий - т.е.
        эта структура типа ключ-значений,значит это коллекция типа Map.
        Других условий нет - значит, можно использовать HashMap. Создать
        такую структуру и уже потом сделать цикл по этой структуре и записать
        всю информацию из этой мапы в файл-отчет.*/
public class Main {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static void MyMenu(){
        System.out.print("1) Add a new file" +
                "\n2) Add a new line to file" +
                "\n3) Delete file" +
                "\n4) Output file information" +
                "\n5) Exit" +
                "\n\nEnter what you want to do: ");
    }
    private static void SaveFile(){
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1";
        File file = new File(folderPath, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File " + fileName + " successfully created");
            } else {
                System.out.println("The file with name " + fileName + " already exists");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void DeleteFile() {
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1";

        File file = new File(folderPath, fileName);
        if (file.delete()) {
            System.out.println("File " + fileName + " deleted successfully");
        } else {
            System.out.println("Failed to delete file with name: " + fileName);
        }
    }
    public static void main(String[] args) throws CounterException {
        while (true) {
            MyMenu();

            int counter = scanner().nextInt();

            switch (counter) {
                case 1:
                    System.out.print("Enter file name: ");
                    SaveFile();
                    break;
                case 2:
                    System.out.println("Hi");
                    break;
                case 3:
                    System.out.print("Enter file name to delete: ");
                    DeleteFile();
                    break;
                case 4:
                    System.out.println("End of the program");
                    System.exit(0);
                    break;
                default:
                    DocNumberFileMistakes.NumberCheck(counter);
            }
        }
    }
}
