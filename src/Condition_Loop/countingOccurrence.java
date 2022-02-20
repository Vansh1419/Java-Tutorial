package Condition_Loop;

import java.util.Scanner;

public class countingOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        while (n > 0) {
            if (n % 10 == 7) {
                p++;
            }
            n /= 10;
        }
        System.out.println(p);
    }
}
