package Function;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        System.out.println(isArmstrong(num));
    }
    static boolean isArmstrong(int a){
        int sum=sum(a);
        if(sum==a){
            return true;
        }
        return false;
    }
    static int sum(int a){
        int sum=0;
        while(a>0){
            int last=a%10;
            sum =  sum+(int)Math.pow(last,3);
            a/=10;
        }
        return sum;
    }
}
