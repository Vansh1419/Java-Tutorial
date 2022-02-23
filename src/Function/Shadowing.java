package Function;

public class Shadowing {
    static int a=10;//❤️ This will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a);
        int a=40;//❤️ the class variable at line 4 is shadowed by this
        System.out.println(a);
        fun();

    }
    static void fun(){
        System.out.println(a);
    }
}
//❤️ shadowing begins only when the variable is initialized otherwise it will give us an
// error
//❤️