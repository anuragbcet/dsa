package kunal_k.Assignments.day3;

import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        System.out.println("ENter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        float area = (float)3.14*r*r;
        System.out.println(area);
        sc.close();
    }
}