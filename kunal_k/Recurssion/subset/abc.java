package kunal_k.Recurssion.subset;

public class abc {
    public static void main(String[] args) {
        String s="abc";
        //find all the possible substring of s;
        subseq("", s);
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    
}
