package ConditionAndLoop;

import java.util.Scanner;

public class largestNumberAmong3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        //❤️ method 1
        /*
        int max=a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        */
        //❤️ method 2
        /*
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=c;
        }
        if (c>max){
            max=c;
        }
        */

        //❤️ method 2
        int max=Math.max(c,Math.max(a,b));


        System.out.println(max);
    }
}
