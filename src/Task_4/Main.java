package Task_4;

/* Дана строка произвольной длины с произвольными словами. Найти слово,
        в котором число различных символов минимально. Слово может
        содержать буквы и цифры. Если таких слов несколько, найти первое из
        них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть
        "fffff".*/
public class Main {
    public static void main(String[] args) {
        NewLine newLine = new NewLine();
        newLine.minimalWordDifference("fffff aaaa f 1234 jkjk");
    }
}
