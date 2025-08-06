package kunal_k.Assignments.day1;

import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        // Here going to find the n fibbonnacci numbers
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print(fibb(i)+" ");
        }
    }
    static int fibb(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibb(n-1)+fibb(n-2);
        }
    }

}
