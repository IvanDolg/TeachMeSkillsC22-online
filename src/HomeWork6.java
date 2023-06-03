import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        tripleDimensionalArray();
        getArr();
        showTwoDimensionalArray(getArray());
        showTwoDimensionalArray1(getArray1());
        showTwoDimensionalArraySum(getArraysSum());
        getSum();
        getDiagonals();
        getSortArray();
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // 1 task
    // Create a three-dimensional array. With the help of loops, "go through"
    // the entire array and increase each element by a given number.
    public static void tripleDimensionalArray(){
        System.out.println("\n\t\t ---- 1 TASK ----");
        int [][][] cubeOriginal  = new int [3][3][3];

        // Random filling of the array
        System.out.println("Random filling of the array: ");
        Random random = new Random();
        for (int i = 0; i < cubeOriginal.length; i++){
            for (int j = 0; j < cubeOriginal[i].length; j++){
                for (int b = 0; b < cubeOriginal[j].length; b++){
                    cubeOriginal[i][j][b] = random.nextInt(10);
                }
            }
        }

        for (int[][] outer : cubeOriginal)
        {
            for (int[] middle : outer)
            {
                for (int inner : middle)
                {
                    System.out.print(inner + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.print("\nWrite the number you want to grow the array by: ");
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
    // 2 task
    // Create a chessboard layout. For an array, we use String.
    public static void getArr(){
        System.out.println("\n\t\t ---- 2 TASK ----");
        String [][] numbers = new String [8][8];

        for (char columns = 0; columns < numbers.length; columns++){
            for (char rows = 0; rows < numbers[columns].length; rows++){
                if (rows % 2 == 0){
                    if (columns % 2 == 0){
                        numbers[rows][columns] = String.valueOf((char) 'W');
                    }else {
                        numbers[rows][columns] = String.valueOf((char) 'B');
                    }
                } else {
                    if (columns % 2 != 0){
                        numbers[rows][columns] = String.valueOf((char) 'W');
                    } else {
                        numbers[rows][columns] = String.valueOf((char) 'B');
                    }
                }
            }
        }
        for (String[] columns : numbers){
            for (String el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
    // Additional tasks
    // 3 task
    // Multiplication of matrices of size 3*3
    public static int[][] getArray(){
        return new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };
    }
    public static int[][] getArray1(){
        return new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };
    }
    public static int[][] getArraysSum(){
        int leng = getArray().length;
        int leng1 = getArray1().length;
        int zero = getArray1()[0].length;
        int [][] getArraysSum = new  int [leng][zero];

        for (int i = 0; i < leng; i++){
            for (int j = 0; j < zero; j++){
                for (int k = 0; k < leng1; k++){
                    getArraysSum[i][j] += getArray()[i][k] * getArray1()[k][j];
                }
            }
        }
        return getArraysSum;
    }
    public static void showTwoDimensionalArray(int[][] getArray) {
        System.out.println("\n\t\t ---- 3 TASK ----");
        System.out.println("First Array is: ");
        for (int[] columns : getArray) {
            for (int el : columns) {
                System.out.print(el + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void showTwoDimensionalArray1(int[][] getArray1) {
        System.out.println("Second Array is: ");

        for (int [] columns : getArray1){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
    public static void showTwoDimensionalArraySum(int[][] getArraysSum){
        System.out.println("\nMultiplying two arrays: " );
        for (int [] columns : getArraysSum()){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
    // 4 task
    // Create a two-dimensional array. Output the sum
    // of all the array elements to the console.
    public static void getSum(){
        System.out.println("\n\t\t ---- 4 TASK ----");
        int sum = 0;
        int [][] array = new int[3][3];

        // Random filling of the array
        System.out.println("Random filling of the array: ");
        Random random = new Random();
        for (int rows = 0; rows < array.length; rows++){
            for (int columns = 0; columns < array[rows].length; columns++){
                array [rows][columns] = random.nextInt(10);
                System.out.print(array[rows][columns] + "\t");
            }
            System.out.println();
        }

        for (int rows = 0; rows < array.length; rows++){
            for (int columns = 0; columns < array[rows].length; columns++){
                sum += array[rows][columns];
            }
        }
        System.out.println("\nSum of array elements: " + sum);
    }
    // 5 task
    // Output the diagonals of the array to the console.
    public static void getDiagonals(){
        System.out.println("\n\t\t ---- 5 TASK ----");
        int [][] array = new int[3][3];

        // Random filling of the array
        System.out.println("Random filling of the array: ");
        Random random = new Random();
        for (int rows = 0; rows < array.length; rows++){
            for (int columns = 0; columns < array[rows].length; columns++){
                array [rows][columns] = random.nextInt(10);
                System.out.print(array[rows][columns] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nMain diagonal: ");
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                if (rows == columns){
                    System.out.print(array[rows][columns] + " ");
                }
            }
        }
        System.out.print("\nSecondary diagonal: ");
        for (int rows = 0; rows < (Math.min(array[0].length, array.length)); rows++) {
                        System.out.print(array[rows][array[0].length - rows - 1] + " ");
        }
    }
    // 6 task
    // Create a two-dimensional array. Sort the elements in
    // the rows of the two-dimensional array in ascending order.
    public static void getSortArray(){
        System.out.println("\n\n\t\t ---- 6 TASK ----");
        int [][] array = new int[3][3];

        // Random filling of the array
        System.out.println("Random filling of the array: ");
        Random random = new Random();
        for (int rows = 0; rows < array.length; rows++){
            for (int columns = 0; columns < array[rows].length; columns++){
                array [rows][columns] = random.nextInt(10);
                System.out.print(array[rows][columns] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSorted array: ");
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                Arrays.sort(array[rows]);
            }
        }
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
}
