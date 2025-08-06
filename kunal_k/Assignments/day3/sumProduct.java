package kunal_k.Assignments.day3;

public class sumProduct {
    public static void main(String[] args){
        // System.out.println("Enter a number :");
        int n=568;
        System.out.println("The difference is "+difference(n));

    }
    static int difference(int n){
        int sum=0;
        int product=1;
        while(n>0){
            int digits=n%10;
            sum=sum+digits;
            product=product*digits;
            n=n/10;
        }
        int difference=product-sum;
        return difference;
    }
    
}
