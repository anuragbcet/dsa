package random_practice;
import java.util.Scanner;

public class Evenodd {
    // the question is to decide the entered number id whether even or odd
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int EnteredNum = sc.nextInt();

        if (EnteredNum == 0) {
            System.out.println("Please enter a number other than 0.");
        } else {
            if (EnteredNum % 2 == 0) {
                System.out.println(EnteredNum + " is an even Number");
            } else {
                System.out.println(EnteredNum + " is an odd number");
            }

        }
        sc.close();
    }

}
