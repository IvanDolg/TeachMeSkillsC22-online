package Task_2;


/*      Программа на вход получает путь к папке (задается через консоль).

        В заданной папке находятся текстовые файлы (формат тхт).

        Каждый файл содержит произвольный текст. В этом тексте может быть
        номер документа(один или несколько), емейл и номер телефона.

        номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это
        любая цифра, а y - это любая буква русского или латинского алфавита
        номер телефона в формате: +(ХХ)ХХХХХХХ

        Документ может содержать не всю информацию, т.е. например, может не
        содержать номер телефона, или другое поле.

        Необходимо извлечь информацию из N текстовых документов. Число
        документов для обработки N задается с консоли.

        Если в папке содержится меньше документов, чем заданное число -
        следует обрабатывать все документы.

        Извлеченную информацию необходимо сохранить в следующую
        структуру данных:

        Map<String, Document>, где
        ключ типа String - это имя документа без расширения,
        значение типа Document - объект кастомного класса, поля которого
        содержат извлеченную из текстового документа информацию

        Учесть вывод сообщений на случаи если,
        - на вход передан путь к папке, в которой нет файлов
        - все файлы имеют неподходящий формат (следует обрабатывать
        только тхт файлы)
        - так же сообщения на случай других исключительных ситуаций

        В конце работы программы следует вывести сообщение о том, сколько
        документов обработано и сколько было документов невалидного
        формата.*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file part: ");

        String part = scanner.nextLine();

        File file = new File(part);
        for (File file1 : file.listFiles()){
            System.out.println(file1.getName());
        }

        //
        String regexp = "^\\+\\(\\d{2}\\)\\d{7}$";
        String regexp1 = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String regexp2 = "\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d[a-zA-Zа-яА-Я]\\d[a-zA-Zа-яА-Я]";

        Pattern pattern = Pattern.compile(regexp);
        Pattern pattern1 = Pattern.compile(regexp1);
        Pattern pattern2 = Pattern.compile(regexp2);
//

        System.out.print("Введите количество документов для обработки: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очистить символ новой строки после ввода числа

        String folderPath = part;
        File folder = new File(folderPath);
        File[] files = folder.listFiles(); // получить список файлов в папке

        if (files != null && files.length > 0) {
            int count = Math.min(n, files.length); // определить, сколько документов обработать

            for (int i = 0; i < count; i++) {
                File file1 = files[i];
                if (file1.isFile()) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            // обработка строки из документа


                            //
                            Matcher matcher = pattern2.matcher(line);

                            if (matcher.find()){
                   /* String match = matcher.group();
                    System.out.println(match);*/
                    /*String match1 = matcher.group();
                    System.out.println(match1);*/
                                String match2 = matcher.group();
                                System.out.println(match2);
                            } else System.out.println("fuuu");
                            //



                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Папка не содержит файлов.");
        }






/*        System.out.print("\nWrite the name of the file you wont to read: ");
        String fileName = scanner.nextLine();
        File file1 = new File(part, fileName);

        System.out.println("\nYour data: ");
        try {
            scanner = new Scanner(file1);

            while (scanner.hasNext()){
                //
                Matcher matcher = pattern2.matcher(scanner.nextLine());

                if (matcher.find()){
                   *//* String match = matcher.group();
                    System.out.println(match);*//*
                    *//*String match1 = matcher.group();
                    System.out.println(match1);*//*
                    String match2 = matcher.group();
                    System.out.println(match2);
                } else System.out.println("fuuu");
            }
            //
            scanner.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
    }
}
