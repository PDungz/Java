import java.util.Scanner;

public class bai1{
    public static void ps(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println("ket qua: " + (a/b));
        }
    }

    public static void main(String[] args) {
        int tuso, mauso;
        System.out.println("CHuong trinh phan so: "); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Tu so: ");
        tuso = sc.nextInt();
        System.out.print("Mau so: ");
        mauso = sc.nextInt();
        
        try {
            ps (tuso, mauso);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.toString());
        } 
        System.out.println("Chay den day");
        sc.close();
    }
}