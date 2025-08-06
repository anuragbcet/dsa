package kunal_k.Assignments.day3;

import java.util.Scanner;
import java.util.ArrayList;

public class ListFactors {
    //Input a number and print all the factors of that number (use loops).
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        int num = sc.nextInt();
        int i=2;
        while(num>1){
           if(num%i==0){
            num=num/i;
            ans.add(i);
           } else {
            i++;
           }
        }
        System.out.println("Factors: " + ans);
    }
}
