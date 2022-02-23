package Function;

import java.util.Scanner;

public class passingValueWhileCalling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int m = sum(x, y);
        System.out.println(m);
    }

    static int sum(int a, int b) {
        int sumOfNum = a + b;
        return sumOfNum;

    }
}
