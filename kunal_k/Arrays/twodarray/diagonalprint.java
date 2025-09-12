package kunal_k.Arrays.twodarray;

import java.util.Arrays;

public class diagonalprint {
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(printDiagoanl(mat)));
    }
    static int[] printDiagoanl(int [][] mat){
        if(mat.length==0) return new int[]{};
        int m=mat.length;
        int n=mat[0].length;
        int col=0;
        int row=0;
        int idx=0;
        int [] result=new int[m*n];
        int dir=1;
        while(idx<m*n){
            result[idx++]=mat[row][col];

            if(dir==1){
                if(col==n-1){
                    row++;
                    dir=-1;
                }else if(row==0){
                    col++;
                    dir=-1;
                }else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==m-1){
                    col++;
                    dir=1;
                }else if(col==0){
                    row++;
                    dir=1;
                }else{
                    col--;
                    row++;
                }

            }


        }
        return result;
    }
}
