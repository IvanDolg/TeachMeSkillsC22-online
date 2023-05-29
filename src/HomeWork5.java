import java.util.Scanner;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        setArray();
    }

    // 0 task
    // Create an array of integers Output a message whether the given number is included
    // in the array or not (use: class Scanner).
    public static void setArray() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{3, 4, 5, 6, 7};
        System.out.println("This is your array: " + Arrays.toString(array));

        System.out.print("\nEnter num what you want: ");
        int num = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("\n" + num + " is in the array");
                return;
            }
        }
        System.out.println(num + " not in the array");
    }

    // 1 task
    // Create an array of integers. Delete all occurrences of the given number from the array.
    // Let the number be given from the console (Scanner class). If there is no such number
    // - print a message about it.
    // The result should be a new array without the specified number.



    // 2 task
    // Create and fill an array with random numbers and output the maximum, minimum and average values.
    // Use the Math.random() method to generate a random number. It will be possible to create an array of any
    // size. The size of the array is entered from the console.

    // 3 task
    // Create 2 arrays of 5 numbers. Output the arrays to the console in two separate lines.
    // Calculate the arithmetic mean of the elements of each array and
    // report which one of the arrays has the greater arithmetic mean (or tell that their arithmetic average is equal).


    // ---- Additional task ----
    // 4 task
    // Create an array of n random integers and display it on the screen.
    // Let the size of the array be set from the console and the size of the array can be
    // greater than 5 and less than or equal to 10. If n doesn't satisfy the condition - print a message saying so.
    // If the user entered a wrong number, the program should ask the user to repeat the input.
    // Create a second array using only even elements of the first array, if there are any, and print it on the screen.

    // 5 task
    // Create an array and fill in the array. Display the array as a string.
    // Mark each element with an odd index by zero. Display the array on a separate line.

    // 6 task
    // Create an array of strings. Fill it with arbitrary names people.
    // Sort the array. Print the result on the console.

    // 7 task
    // Bubble sorting

}
