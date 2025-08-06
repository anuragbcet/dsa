package kunal_k.Backtracking;

public class printPath {
    public static void main(String[] agrs){
        //this is also a maze problem where i am going to print all the path followed
        int rows=3;
        int cols=3;
        path(0,0 , rows, cols,"");

    }
    static void path(int sr,int sc,int er ,int ec,String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec ){
            System.out.println(s);
            return;
        }
        //when going right 
        path(sr+1, sc, er, ec, s+"R");

        //when going down
        path(sr, sc+1, er, ec, s+"D");

    }
}
