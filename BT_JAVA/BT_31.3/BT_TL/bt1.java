import java.util.Scanner;

public class bt1 {
    private int a = 50;

    public bt1() {
        
    }

    public void doubleValue(int a) {
        a = a*2;
    }
    public void doubleValue(bt1 b) {
        b.a = b.a*2;
    }
    
    public static void main(String[] arg) {
        bt1 obj = new bt1();
        System.out.println("Before pass to method: " + obj.a);
        obj.doubleValue(2);
        System.out.println("After pass to method: " + obj.a);
        bt1 ob1 = new bt1();
        ob1.doubleValue(ob1);
        System.out.println("After pass to method: " + ob1.a);
    }
}