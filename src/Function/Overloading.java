package Function;

public class Overloading {
    public static void main(String[] args) {
        fun(32);
        fun("vansh jain");
        fun(67,87);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a,int b){
        System.out.println(a+" "+b);
    }
}
//int overloading i f you don't provide any value to function then it will give error called
//ambiguity