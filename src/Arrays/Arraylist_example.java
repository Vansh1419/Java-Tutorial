package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ❤️ Syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(4);
//        list.add(234);
//        list.add(4324);
//        list.add(34324);
//
//        System.out.println(list.contains(324));
//        System.out.println(list.contains(3));
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list.contains(3));
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);


        //❤️ Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //❤️ Output
        System.out.println(list);

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
