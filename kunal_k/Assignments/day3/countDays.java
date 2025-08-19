package kunal_k.Assignments.day3;

import java.util.Scanner;

public class countDays {
    public static void main(String[] args){
        //Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        System.out.println("Enter the number of days in the month");
        Scanner sc= new Scanner(System.in);
        int days =sc.nextInt();
        int outingdays = days/2;
        System.out.println("the number of outing days : " + outingdays);
    }
    
}
