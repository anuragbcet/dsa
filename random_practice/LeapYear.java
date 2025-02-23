package random_practice;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int Enteredyear= sc.nextInt();

        if(Enteredyear%400==0){
            System.out.println(Enteredyear +" is the leap year");
        }
    }
}