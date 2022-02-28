package Arrays;
//Arrays are mutable
public class Array_syntax {
    public static void main(String[] args) {
        // Syntax
        // datatype[] variable_name = new datatype[size];
        //Store 5 numbers
//        int[] roll_no = new int[5];
//        // or directly
//        int[] roll_no2 = {23, 432, 24, 12, 35};
        int [] ros; //Declaration if arrays.ros is getting defined in the stack
        ros =new int[5];//Initialization: actually here object is created in the memory (heap)
        String[] arr=new String[5];

        //❤️ Index of an array
        System.out.println(ros[1]);
        System.out.println(arr [1]);



    }
}
