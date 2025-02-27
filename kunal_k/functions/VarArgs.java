import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(2, 30, "Anurag","shubham","abhinav","neel");
    }

    static void multiple(int a,int b,String ...v){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println(Arrays.toString(v));
    }
}
