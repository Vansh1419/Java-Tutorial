package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        System.out.println(arr[3]);
        //Input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
        }
        //❤️ Output printing of an array

        System.out.println("simple for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println("enhanced for loop");
        for (int j : arr) {//for every element in an array we print an array
            System.out.print(j + " ");//here j represents element of an array
        }
        System.out.println();


        System.out.println("Array.toString() method");
        System.out.println(Arrays.toString(arr));


        //Array of objects
        String[] str=new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i]= in.next();
        }
        //❤️ Output printing of an array

        System.out.println("simple for loop");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        System.out.println();


        System.out.println("enhanced for loop");
        for (String j : str) {//for every element in an array we print an array
            System.out.print(j + " ");//here j represents element of an array
        }
        System.out.println();


        System.out.println("Array.toString() method");
        System.out.println(Arrays.toString(str));


    }
}
