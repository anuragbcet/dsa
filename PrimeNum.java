import java.util.Scanner;

public class PrimeNum {
    // Here i have to check the inserted interger to be prime or not
    public static void main(String[] args) {
        System.out.print("Enter a positive number : ");
        Scanner sc = new Scanner(System.in);
        int EnteredNum = sc.nextInt();
        int count = 0;
        if (EnteredNum > 0) {
            for (int i = 1; i < EnteredNum; i++) {
                if (EnteredNum % i == 0) {
                    count++;
                }
            }
        } else {
            System.out.println("Enter a valid integer");
        }
        if (count == EnteredNum - 1) {
            System.out.println("it is prime");
        } else {
            System.out.println("it is not prime");
        }
    }
}
