package Function;

public class ReturningString {
    public static void main(String[] args) {
//        String message = greet();//❤️this comes from function greet()
//        System.out.println(message);

        String personal=myGreet("vansh jain");
        System.out.println(personal);
    }

    static String myGreet(String name) {
        String message="Hello "+name;
        return message;
    }

    static String greet(){
        String greeting="how are u";
        return greeting;
    }
}
