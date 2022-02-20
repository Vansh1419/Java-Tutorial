package Function;

import java.util.Scanner;

public class sumViaFunctions {
    public static void main(String[] args) {
        //System.out.println("sum function");
        // sum();
        System.out.println("sum2 function");
        // sum2(); //❤️ here sum2() means the value
        System.out.println(sum2());
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;
        n1 = in.nextInt();
        n2 = in.nextInt();
        sum = n1 + n2;
        return sum;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;
        n1 = in.nextInt();
        n2 = in.nextInt();
        sum = n1 + n2;
        System.out.println(sum);
    }
    /*
     * ❤️ Function in a class is called methods
     * access modifier(❤️ Learn in oops) return_type name(){
     *      //body
     *      return statement;
     * }
     *
     */
}
