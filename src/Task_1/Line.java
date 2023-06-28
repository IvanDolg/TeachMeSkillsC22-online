package Task_1;

public class Line {

    /* The method of displaying the first two blocks of 4 digits in one line. */
    public static String printFirstTwoBlocks(String documentNumber){
        String[] parts = documentNumber.split("-");
        return parts[0] + "\t" + parts[2];
    }

    /*  Let's display the document number on the screen, replace the blocks of three letters with stars. */
    public static String replacingLetters(String documentNumber){
        char newChar = '*';
        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isDigit(documentNumber.charAt(i))){
                continue;
            } else documentNumber =  documentNumber.replace(documentNumber.charAt(i), newChar);
        }
        return documentNumber;
    }

    /*    We will display only one letter from the document number in the format yyy/yyy/y/y in lowercase.*/
    public static void printOnlyLetter(String documentNumber){
        documentNumber = documentNumber.toLowerCase().replace('-', '/');
        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                System.out.print(documentNumber.charAt(i));
            } else {
                if (i - 1 < 0) {
                    continue;
                }
                if (Character.isLetter(documentNumber.charAt(i - 1))) {
                    System.out.print('/');
                }
            }
        }
    }

    /*    Let's display the letters from the document number in the format "Letters:yyy/yyy/y/y"
          in uppercase (implemented using the StringBuilder class).*/
    public static void useStringBuilder(String documentNumber){
        System.out.print("Letter: ");
        documentNumber = documentNumber.toUpperCase();
        for (int i = 0; i < documentNumber.length(); i++) {
            if (Character.isLetter(documentNumber.charAt(i))) {
                System.out.print(documentNumber.charAt(i));
            }else {
                if (i - 1 < 0) {
                    continue;
                }
                if (Character.isLetter(documentNumber.charAt(i - 1))) {
                    System.out.print('/');
                }
            }
        }
    }

    /*    Let's check whether the document number contains the sequence abc and output the message contains or not.*/
    public static void checkSequnce(String documentNumber){
        System.out.println("Contains sequence 'abc': " + documentNumber.toLowerCase().contains("abc") );
    }

    /*    Let's check if the document number starts with the sequence 555*/
    public static void checkSequnce1(String documentNumber){
        String[] parts = documentNumber.split("-");
        System.out.println("Contains sequence '555': " + parts[0].contains("555"));
    }

    /*    let's check whether the document number ends in a sequence 1a2b.*/
    public static void checkSequnce2(String documentNumber){
        String[] parts = documentNumber.split("-");
        System.out.println("Contains sequence '1a2b': " + parts[4].contains("1a2b"));
    }
}