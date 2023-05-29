import java.util.Scanner;
import java.util.Arrays;


public class HomeWork5 {
    public static void main(String[] args) {
        //setArray();
        //System.out.println("Array without element " + setArray2());
        //setArray3();
        setArray4();
    }

    // 0 task
    // Create an array of integers Output a message whether the given number is included
    // in the array or not (use: class Scanner).
    public static void setArray() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{3, 4, 5, 6, 7};
        System.out.println("This is your array: " + Arrays.toString(array));

        System.out.print("\nEnter number what you want to print: ");
        int num = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("The number " + num + " is in the array");
                return;
            }
        }
        System.out.println("The number " + num + " not in the array");
    }

    // 1 task
    // Create an array of integers. Delete all occurrences of the given number from the array.
    // Let the number be given from the console (Scanner class). If there is no such number
    // - print a message about it.
    // The result should be a new array without the specified number.
    // System.out.println("The" + num + "is not from the array, array is: " + Arrays.toString(res));
    public static String setArray2(){
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        int[] array = new int[]{3, 4, 5, 6, 7};
        System.out.println("\nThis is your array: " + Arrays.toString(array));
        int [] resultArr = new int[array.length - 1];

        System.out.print("Enter the number the number you want to delete: ");
        int num = scanner.nextInt();

        if (num < 3 || num > 7){
            System.out.println("The number " + num + " is not from the array");
            System.exit(0);
        }

        for(int i = 0; i < array.length; i++) {
            if (array[i] != num) {
                resultArr[index] = array[i];
                index++;
            }
        }
        return Arrays.toString(resultArr);
    }

    // 2 task
    // Create and fill an array with random numbers and output the maximum, minimum and average values.
    // Use the Math.random() method to generate a random number. It will be possible to create an array of any
    // size. The size of the array is entered from the console.
    public static void setArray3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of indexes: ");
        int index = scanner.nextInt();

        int[] array = new int [index];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * index) - 15);
        }
        System.out.println("\nRandom array: \n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array: \n" + Arrays.toString(array));

        System.out.print("\nWhat do you want to output: \n" +
                "1) Output the minimum element of the array \n" +
                "2) Output the maximum element of the array \n" +
                "3) Output the middle element of the array \n" +
                "\nYour choice: ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Minimum element of the array: " + array[0]);
                break;
            case 2:
                System.out.println("Maximum element of the array: " + array [array.length-1]);
                break;
            case 3:
                System.out.println("Middle element of the array: " + array [(array.length-1)/2]);
                break;
            default:
                System.out.println("Enter correct number ;)");
                break;
        }
    }

    // 3 task
    // Create 2 arrays of 5 numbers. Output the arrays to the console in two separate lines.
    // Calculate the arithmetic mean of the elements of each array and
    // report which one of the arrays has the greater arithmetic mean (or tell that their arithmetic average is equal).
    public static void setArray4(){
        int[] array = new int [5];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 5) + 8);
        }
        System.out.println("\nFirst random array: \n" + Arrays.toString(array));

        int[] array1 = new int [5];
        for (int i = 0; i < array1.length; i++){
            array1[i] = ((int) (Math.random() * 5) + 8);
        }
        System.out.println("Second random array: \n" + Arrays.toString(array1));

        int sum = Arrays.stream(array).sum();
        int sum1 = Arrays.stream(array1).sum();
        System.out.println("\nSum of the first array: " + sum);
        System.out.println("Sum of the second array: " + sum1 + "\n");

       String res = sum == sum1 ? "First array & second array are equal \n" : sum < sum1 ? "The first array is" +
               " less than the second array \n" : "The first array is greater than the second array \n";
        System.out.println(res);


    }

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
