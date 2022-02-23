package Function;

public class Scope {
    public static void main(String[] args) {
        //Scope means where we can access our variables
        int a = 10;
        int b = 10;
//        System.out.println(num);
        /*
            the value initialized outside blocked scope can be modified in block scope
            but the value initialized in block scope cannot be access or modified outside
            blocked scope
         * */
//        ❤️ Blocked Scope❤️️
        {
            a = 90;
            int c = 87;
        }
/*
        c=30;
        System.out.println(c);
*/
    }

    static void random() {
//        System.out.println(a);
        int num = 67;
        System.out.println(num);

    }
}
