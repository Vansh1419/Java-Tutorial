package ConditionAndLoop;

public class ifStatements {
    public static void main(String[] args) {
        /*
         * ❤️ Syntax of if statements
         * if(condition){
         *      statement 1
         *      statement 2
         * }
         * else{
         *      statement 3
         *      statement 4
         * }
         */
        int salary =24500;


        /* ❤️ this is single if-else statement
        if (salary>10000) {
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
        */

        /*❤️ if-else ladder
        if (salary>10000) {
            salary+=2000;
        }
        else if (salary>20000) {
            salary+=3000;
        }
        else{
            salary+=1000;
        }
        */

        System.out.println(salary);
    }
}
