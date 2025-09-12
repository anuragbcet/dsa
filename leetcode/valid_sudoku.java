package leetcode;

import java.util.HashSet;

public class valid_sudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(checkSudoko(board));
    }
    static boolean checkSudoko(char[][] board){
        int N=9;
        @SuppressWarnings("unchecked")
        HashSet<Character>[] rows = (HashSet<Character>[]) new HashSet[N];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] cols = (HashSet<Character>[]) new HashSet[N];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] boxes = (HashSet<Character>[]) new HashSet[N];

        for(int i=0;i<N;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val=board[r][c];
                if(val=='.'){
                    continue;
                }
                //check in row hashset
                if(rows[r].contains(val)){
                    return false;
                }
                rows[c].add(val);

                //check in column hashset
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                int index=((r/3)*3)+(c/3);
                if(boxes[index].contains(val)){
                    return false;
                }
                boxes[index].add(val);
            }
        }
        return true;
    }

}
