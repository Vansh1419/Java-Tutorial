package FirstJavaProgram;

import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        /*
         * ❤️ main function is the entry point of java file
         * ❤️ public makes main function to be available to be executed from any where
         * ❤️ static is used here as main function is the entry point and static is used
         * to execute main function without creating a object of main class
         * ❤️ String[]args--> it is command line argument
         */

        /*
         * ❤️Input❤️
         * System.out.println("hello world");
         * System.out.print("hello world"); //❤️ donot a new line
         * System.out.println(568658);
         */

        /*
         * ❤️Output❤️
         * Scanner input = new Scanner(System.in);
         * System.out.println(input.nextInt()); //❤️ input integer
         * System.out.println(input.next()); //❤️ input string or first letter of line
         * System.out.println(input.nextLine()); //❤️ input a line
         */

        /*
         * ❤️Primitive datatypes❤️
         * int a=64;
         * char letter='a';
         * float b=34.345f;
         * double largeDecimalNumbers = 65685868.769768d;
         * long largeInteger =549896598568468l;
         * boolean check =true;
         */

        /*
         * ❤️ Taking input fo various datatypes❤️
         * Scanner input = new Scanner(System.in);
         * int rollno = input.nextInt();
         * System.out.println("roll no is " + rollno);
         *
         * String name =input.nextLine();
         * System.out.println(name);
         *
         * float marks = input.nextFloat();
         * System.out.println("marks are " + marks);
         */

        Scanner input = new Scanner(System.in);
        // int num = input.nextFloat(); ❤️ this will give error
        // int num = (int)(input.nextFloat()); //❤️ this is callled typecasting

        /*
         * ❤️Important things about byte❤️
         *
         *
         * //❤️ Automatic type promotion in expression
         * int a=257;
         * byte b=(byte)(a);
         *
         * System.out.println(b);
         * //
         * //❤️ Here max value of byte is 256 and we are trying to store 257 in it so in
         * //that case b store the value = a%(max value of byte)
         */
        // byte x=20;
        // byte y=50;
        // byte z=100;
        //// byte m=x*y/z; //❤️ this would give error as 20*50 =1000 is int not a byte
        // int n=x*y/z; //❤️ in this case 20/50=1000 automatic convert into int
        // System.out.println(n);

        // byte o=2;
        // o=o*2; //❤️ as o*2 is int so we cannot store it in byte without typecasting

        /*
         * ❤️Automatic typecasting❤️
         * byte b = 42;
         * char c = 'a';
         * short s = 1024;
         * int i = 50000;
         * float f = 5.67f;
         * double d = 0.1234;
         * double result = (f * b) + (i / c) - (d * s);
         * // float + int - double = double
         * System.out.println((f * b) + "  " + (i / c) + "  " + (d * s));
         * System.out.println(result);
         */

        /*
         * ❤️while loop❤️
         * int count=1;
         * while (count!=5) {
         * System.out.println(count);
         * count++;
         * }
         */
        /*
         * for (int i = 1; i < 5; i++) {
         * System.out.println(i);
         * }
         */

    }
}
