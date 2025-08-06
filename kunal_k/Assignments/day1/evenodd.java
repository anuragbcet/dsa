package kunal_k.Assignments.day1;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}
