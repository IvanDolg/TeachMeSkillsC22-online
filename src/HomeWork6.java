import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        tripleDimensionalArray();
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // 1 task
    // Create a three-dimensional array. With the help of loops, "go through"
    // the entire array and increase each element by a given number.
    public static void tripleDimensionalArray(){
        System.out.println("\n\t\t ---- 1 TASK ----");
        int [][][] cubeOriginal  = {{{1, 2, 3}, {10, 20, 30, 40}}, {{500, 600}}};

        System.out.print("Write the number you want to grow the array by: ");
        int number = scanner().nextInt();

        for (int[][] outer : cubeOriginal)
        {
            for (int[] middle : outer)
            {
                for (int inner : middle)
                {
                    inner += number;
                    System.out.print(inner + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
