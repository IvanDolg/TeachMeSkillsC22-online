package Task_3;

public class LineMethod {

/*    A method for finding the shortest word. If there are several such words, print the last word. */
    public static void shortesWtord(String line){
        String[] parts = line.split(" ");
        String maxElement = parts[0];

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() >= maxElement.length()){
                maxElement = parts[i];
            }
        }
        System.out.println("Max el: " + maxElement);
    }

/*    A method for finding the longest word. If there are several such words, print the last word. */
    public static void longestWord(String line){
        String[] parts = line.split(" ");
        String minElement = parts[0];

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() <= minElement.length()){
                minElement = parts[i];
            }
        }
        System.out.println("Min el: " + minElement);
    }

}
