package kunal_k.Assignments.day0;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        // Take numbers as input and find their HCF and LCM
        System.out.println("Enter First Number:");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter second number:");
        int second = sc.nextInt();
        System.out.println(lcm(first,second));

    }

    static int lcm(int a, int b) {
        // will solve later
        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }
        return ans;
    }

}
