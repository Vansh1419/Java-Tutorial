package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input_output_2D_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        //❤️ Input of 2D-Array
        for (int i = 0; i < arr.length; i++) {
            //for every column in every row
            for(int j=0;j<arr[i].length ;j++){
                arr[i][j]=in.nextInt();
            }
        }
        //❤️ Output of 2D-Array
        System.out.println("simple for loop");
        for (int i = 0; i < arr.length; i++) {
            //for every column in every row
            for(int j=0;j<arr[i].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("printing using enhanced for loops");
        for (int[] ints : arr) {
            //for every column in every row
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("using Array.toString()");
        for (int i = 0; i < arr.length; i++) {
            //for every column in every row
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }

    }
}
