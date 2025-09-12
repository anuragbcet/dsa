package kunal_k.BitWise;

public class setIthbit {
    // This states the i have to set the ith bit of any number to one;
    // eg:- a=5 i.e; 1001;
    // set 2nd bit then a=1011;
    public static void main(String[] args) {
        int a=5;
        int i=2;
        System.out.println(setbit(a, i));

    }

    static int setbit(int a,int i) {
        int mask=1<<(i-1);
        a= a | mask;
        return a;
    }

}
