package kunal_k.Assignments.day1;

public class checkPalindrome {
    public static void main(String[] args) {
        String s="abba";
        System.out.println(Palindrome(s));

    }
    static boolean Palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
