package kunal_k.Recurssion;

public class skip {
    public static void main(String[] args) {
        String s ="basscaas";
        System.out.println(skipString(s));
    }
    //this is the method using normal iterative method 

    // static String skipA(String s){
    //     String b="";
    //     for(int i=1;i<s.length();i++){
    //         if(s.charAt(i)=='a'){
    //             continue; 
    //         }
    //         else{
    //             b=b+s.charAt(i);
    //         }
    //     }
    //     return b;
    // }

    //2nd method :- Using Recurssion
    //In this method i passes to argument in the function.
    // static void skipA(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     if(ch=='n'){
    //         skipA(p,up.substring(1));
    //     }
    //     else{
    //         skipA(p+ch, up.substring(1));
    //     }
    // }

    //3rd method :- Using Recurssion but with only one argument 
    static String skipString(String s){
       if(s.isEmpty()){
        return "";
       }
       char ch = s.charAt(0);
       if(ch=='a'){
        return skipString(s.substring(1));
       }
       else{
        return ch+skipString(s.substring(1));
       }
    }
}
