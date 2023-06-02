import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        tripleDimensionalArray();
        getArr();
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
    // 2 task
    // Create a chessboard layout. For an array, we use String.
    public static void getArr(){
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
}
