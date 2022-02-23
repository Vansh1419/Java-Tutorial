package Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23, 4, 54, 45, 3, 2, 34, 24, 51, 2);
        multiple(2,3,"vansh","sambhav","ishika");
    }

    static void multiple(int a,int b,String ...v) {
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }

    static void fun(int... v) {//it is taking array of integer
        //Variable length arguments` method is used when we don't know how many inputs we
        // required
        System.out.println(Arrays.toString(v));
    }
}
