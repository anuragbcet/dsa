package kunal_k.Backtracking;

public class simplemaze {
    public static void main(String[] args) {
        // it is the rule defined that it can move only in two direction either right or down.
        System.out.println(countpath(0, 0, 3, 3));
        
    }
    static int countpath(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sc==ec && sr==er) return 1;

        int down=countpath(sr, sc+1, er, ec);
        int right=countpath(sr+1, sc, er, ec);

        int totalways=down+right;
        return totalways;
    }
    
}
