package SwitchStatement;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit=in.next();
        switch (fruit) {
            case "Apple":
                System.out.println("red");
                break;
            case "orange":
                System.out.println("orange");
                break;
            case "grape":
                System.out.println("small");
                break;
            case "mango":
                System.out.println("yellow");
                System.out.println("hello");
                break;
        
            default:
            System.out.println("enter correct value");
                break;
        }
    }
}
