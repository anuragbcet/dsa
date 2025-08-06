package kunal_k.Assignments.day3;
import java.util.Scanner;

public class sumOfN {
    //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String [] agrs){
        System.out.println("Enter the numbers: ");
        Scanner sc =new Scanner(System.in);
        int sum=0;

        while (true) {
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            sum=sum+n;
        }
        System.out.println("The sum of the inserted numbers is: "+ sum);

    }
    
}
