package ConditionAndLoop;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        //❤️ trim() removes extra space
        if(ch>='a'&&ch<='z'){
            System.out.println("lowercase");
        }
        else if(ch>'A'&&ch<'Z'){
            System.out.println("uppercase");
        }
        // System.out.println(ch);
    }
}
