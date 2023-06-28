package Task_1;

/* Написать программу со следующим функционалом:
        На вход передать строку (будем считать, что это номер документа). Номер
        документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y —
        это буква.
        - Вывести на экран в одну строку два первых блока по 4 цифры.
        - Вывести на экран номер документа, но блоки из трех букв заменить на
        *** (каждая буква заменятся на *).
        - Вывести на экран только одни буквы из номера документа в формате
        yyy/yyy/y/y в нижнем регистре.
        - Вывести на экран буквы из номера документа в формате
        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
        класса StringBuilder).
        - Проверить содержит ли номер документа последовательность abc и
        вывети сообщение содержит или нет(причем, abc и ABC считается
        одинаковой последовательностью).
        - Проверить начинается ли номер документа с последовательности 555
        - Проверить заканчивается ли номер документа на последовательность
        1a2b.
        Все эти методы реализовать в отдельном классе в статических методах,
        которые на вход (входным параметром) будут принимать вводимую на вход
        программы строку.*/

public class Main {
    public static void main(String[] args) {
        Line line = new Line();
        System.out.println("1 Method: ");
        System.out.println(line.printFirstTwoBlocks("1234-erf-5678-tyu-9t0p"));
        System.out.println("2 Method: ");
        System.out.println(line.replacingLetters("1234-erf-5678-tyu-9t0p"));
        System.out.println("3 Method: ");
        line.printOnlyLetter("1234-Erf-5678-tYu-9P0P");
        System.out.println("\n4 Method: ");
        line.useStringBuilder("1234-Erf-5678-tYu-9P0P");
        System.out.println("\n5 Method: ");
        line.checkSequnce("1234-Erf-5678-tYu-9P0P");
        System.out.println("6 Method: ");
        line.checkSequnce1("5554-Erf-5678-tYu-9P0P");
        System.out.println("7 Method: ");
        line.checkSequnce2("5554-Erf-5678-tYu-1a2b");
    }
}
