package kunal_k.Recurssion.subset;

public class AllSubsequence {
    public static void main(String[] args) {
        String s="abc";
        subsequence(s);

    }
    static void subsequence(String s){
        helper(s, "", 0);
        return ;
    }

    static void helper(String s,String st,int i){
        if(i==s.length()){
            System.out.println(st);
            return;
        }

        helper(s, st+s.charAt(i), i+1);
        helper(s, st, i+1);
    }

    static void helper2(String s,String up){
        if(up.length()==0){
            System.out.println(s);
            return ;
        }

        helper2(s+up.charAt(0) ,up.substring(1));
        helper2(s ,up.substring(1));
    }
}
