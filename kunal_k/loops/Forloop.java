

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Hello world "+(i+1));
        }
        sc.close();
    }
}
