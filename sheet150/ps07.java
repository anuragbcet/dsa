package sheet150;

public class ps07 {
    public static void main(String[] args) {
        pattern(5);
        //print start pattern ;
    }
    public static void pattern(int n){
        for(int i=1;i<n/2;i++){
            System.out.println(" ");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}
