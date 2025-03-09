

import java.util.Scanner;

public class While {
    // here i am just impliment while loop
    /*
     * syntax:
     * while(condition){
     * body
     * }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        while (count <= number) {
            System.out.println("hello world");
            count++;
        }
        sc.close();
    }

}
