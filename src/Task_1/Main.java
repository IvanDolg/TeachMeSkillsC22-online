package Task_1;

import Task_1.Exception.CounterException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

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
    private static void MyMenu(){
        System.out.print("\n1) Add a new file" +
                "\n2) Add a new line to file" +
                "\n3) Validation check" +
                "\n4) Output file information" +
                "\n5) Delete file" +
                "\n6) Exit" +
                "\n\nEnter what you want to do: ");
    }
    private static void SaveFile(){
        System.out.print("Enter file name: ");
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
        System.out.print("Enter file name to delete: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1";

        File file = new File(folderPath, fileName);
        if (file.delete()) {
            System.out.println("File " + fileName + " deleted successfully");
        } else {
            System.out.println("Failed to delete file with name: " + fileName);
        }
    }
    private static void AddDataToFile() throws IOException {
        System.out.print("\nWrite the name of the file you wont to save the data to: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1";
        File file = new File(folderPath, fileName);

        List<String> list = new ArrayList<>();

        System.out.print("\nEnter the number of data rows: ");
        int amountOfData = scanner().nextInt();

        System.out.println("\nEnter the data: ");
        for (int i = 0; i < amountOfData; i++) {
            list.add(scanner().nextLine());
        }

        System.out.println("\nYour entered data: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            Files.write(file.toPath(), list, StandardCharsets.UTF_8);
        }
    }
    private static void ReadInformation() {
        System.out.print("\nWrite the name of the file you wont to read: ");
        String fileName = scanner().nextLine();
        String folderPath = "src/Task_1";
        File file = new File(folderPath, fileName);

        System.out.println("\nYour data: ");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws CounterException, IOException {
        while (true) {
            MyMenu();
            int counter = scanner().nextInt();

            switch (counter) {
                case 1:
                    SaveFile();
                    break;
                case 2:
                    AddDataToFile();
                    break;
                case 3:
                    //validation check
                    break;
                case 4:
                    ReadInformation();
                    break;
                case 5:
                    DeleteFile();
                    break;
                case 6:
                    System.out.println("End of the program");
                    System.exit(0);
                    break;
                default:
                    DocNumberFileMistakes.NumberCheck(counter);
            }
        }
    }
}
