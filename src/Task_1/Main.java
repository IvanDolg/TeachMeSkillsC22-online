package Task_1;

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