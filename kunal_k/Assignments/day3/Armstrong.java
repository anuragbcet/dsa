package kunal_k.Assignments.day3;

public class Armstrong {
    public static void main(String[] args){
        //Armstrong Number In Java
        System.out.println(chechArmstrong(51));


    }
    static boolean chechArmstrong(int num){
        int digits=countDigits(num);
        int formNum=0;
        int num2=num;
        while(num2>0){
            int n=num2%10;
            formNum=formNum + (int)Math.pow(n, digits);
            num2=num2/10;
        }
        if(num==formNum){
            return true;
        }
        return false;

    }
    static int countDigits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    
}
