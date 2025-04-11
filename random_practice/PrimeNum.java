// package random_practice;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int enteredNum = sc.nextInt();
        sc.close(); // Always close the Scanner after use
        
        if (enteredNum <= 1) {
            System.out.println("Enter a valid positive integer greater than 1.");
            return;
        }
        
        boolean isPrime = true;
        
        for (int i = 2; i * i <= enteredNum; i++) { // Loop from 2 to sqrt(n)
            if (enteredNum % i == 0) {
                isPrime = false;
                break; // No need to check further
            }
        }
        
        if (isPrime) {
            System.out.println(enteredNum + " is a prime number.");
        } else {
            System.out.println(enteredNum + " is not a prime number.");
        }
    }
}

