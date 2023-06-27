package Task_1;

import java.util.Arrays;

public class Line {

/* The method of displaying the first two blocks of 4 digits in one line. */
    public static String printFirstTwoBlocks(String documentNumber){
        String[] parts = documentNumber.split("-");
        return parts[0] + "\t" + parts[2];
    }

/*  Let's display the document number on the screen, replace the blocks of three letters with stars. */

}
