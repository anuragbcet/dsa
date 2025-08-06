package kunal_k.Assignments.day3;

import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args){
        //find the perfect number
        //A perfect number is number which is the sum of thier proper divisors
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int formedNum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                formedNum=formedNum+i;
            }
        }
        if(formedNum==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
    
}
