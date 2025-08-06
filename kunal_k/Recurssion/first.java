package kunal_k.Recurssion;

public class first {
    public static void main(String[] args) {
        message1();
        
    }

    static void message1(){
        System.out.println("Hello world 1");
        message2();
    }
    static void message2(){
        System.out.println("Hello world 2");
        message3();
    }

    static void message3(){
        System.out.println("Final hello world !!");
    }
}
