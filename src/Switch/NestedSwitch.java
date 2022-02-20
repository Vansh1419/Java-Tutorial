package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
        switch (empId) {
            case 1:
                System.out.println("kunal");
                break;
            case 2:
                System.out.println("vansh");

                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT");
                    case "Sales" -> System.out.println("Sales");
                    case "executive" -> System.out.println("executive");
                    default -> {
                    }
                }
                break;

            default:
                System.out.println("enter correct Id");
                break;
        }
    }
}
