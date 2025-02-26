import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.print("Enter your Number: ");
        Scanner sc = new Scanner(System.in);
        int Number= sc.nextInt();
        int ReverseNum=0;
        while(Number>0){
            int rem=Number%10;
            ReverseNum=(ReverseNum*10)+rem;
            Number=Number/10;
        }
        System.out.println("Reversed number is "+ReverseNum);  
    }
}
