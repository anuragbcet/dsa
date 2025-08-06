package kunal_k.Recurssion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev(123));
    }
    static int rev(int n){
        if(n==0){
            return 0;
        }
        int ReverseNum=0;
        return ReverseNum*10+n%10;
    }

    // static int rev(int n){
    //     int ReverseNum=0;
    //     while(n>0){
    //         int rem=n%10;
    //         n=n/10;
    //         ReverseNum=ReverseNum*10+rem;
    //     }
    //     return ReverseNum;
    // }
    
}
