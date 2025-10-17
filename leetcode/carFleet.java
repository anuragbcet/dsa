package leetcode;

public class carFleet {
    public static void main(String[] args) {
        
    }

    static int numberoffleet(int target, int[] position, int[] speed){
        int[] time=new int[position.length];
        for(int i=0;i<time.length;i++){
            time[i]=(target-position[i])/speed[i];
        }
        for(int i=0;i<position.length;i++){
            for(int j=0;j<speed.length;j++){
                if(i==j){
                    continue;
                }else{
                    if(){

                    }
                }
            }
        }
       return 0;
    }
}
