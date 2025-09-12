package kunal_k.BitWise;

public class findithbit {
    //In this question i have to find the ith bit of a number 
    //i.e, the least significant bit of any number is the last bit
    // and i have to find the ith bit from the last;
    public static void main(String[] args) {
        int a=3;
        int i=3;
        int mask= 1<<(i-1);
        int ans = ((a & mask) != 0) ? 1 : 0;
        System.out.println(ans);
    }
    
}
