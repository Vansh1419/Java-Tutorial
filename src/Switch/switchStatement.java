package Switch;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit=in.next();
        switch (fruit) {
            case "Apple" -> System.out.println("red");
            case "orange" -> System.out.println("orange");
            case "grape" -> System.out.println("small");
            case "mango" -> {
                System.out.println("yellow");
                System.out.println("hello");
            }
            default -> System.out.println("enter correct value");
        }
    }
}
