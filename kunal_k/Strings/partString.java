package kunal_k.Strings;

public class partString {
    public static void main(String[] args) {
        String s="A12";

        char ch=s.charAt(0);

        String numberpart=s.substring(1);
        int num=Integer.parseInt(numberpart);

        System.out.println(ch);
        System.out.println(num);
    }
}
