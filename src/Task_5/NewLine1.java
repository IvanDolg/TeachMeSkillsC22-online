package Task_5;

public class NewLine1 {
    public static boolean checked(String[] parts, int index){
        if (index < 0 || index > parts.length-1){
            System.out.println("Incorrectly entered word verification index: " + index +
                    "\nArray length: " + parts.length);
            return false;
        } else {
            return true;
        }
    }
    public static boolean wordPalindrome(String line, int index){
        System.out.println("Yor line is: " + "[" +  line + "]");
        String[] parts = line.split(" ");

        if (checked(parts, index)){
            String newLine = new StringBuilder(parts[index]).reverse().toString();
            return parts[index].equalsIgnoreCase(newLine);
        } else return false;
    }
}
