package SwitchStatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId=in.nextInt();
        String department=in.next();
        switch (empId) {
            case 1:
                System.out.println("kunal");
                break;
                case 2:
                System.out.println("vansh");
                
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    case "executive":
                        System.out.println("executive");
                        break;
                
                    default:
                        break;
                }
                break;
        
            default:
            System.out.println("enter correct Id");
                break;
        }
    }
}
