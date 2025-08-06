package kunal_k.Recurssion;

public class fibo {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(fib(i));
        }
    }

 

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
