package kunal_k.Assignments.day3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        // Calculate and print the Electricity Bill.
        // Rates:-
        // 1 to 102
        // ₹5.30
        // 103 to 180
        // ₹5.97
        // 181 to 300
        // ₹6.97
        // 301 to 600
        // ₹7.31
        System.out.println("Enter the Amount of units used: ");
        Scanner sc = new Scanner(System.in);
        int unit=sc.nextInt();
        float cost=0;
        if(0<unit && unit<=102){
            cost= (float)5.30*unit;
        }
        if(102<unit && unit<=180){
            cost=(float)5.30*102+(float)5.97*(unit-102);
        }
        if(unit>180 ){
            cost=(float)5.30*102+(float)5.97*78+(float)6.97*(unit-180);
        }
        System.out.println("The amount to be paid is : "+cost);
    }

}
