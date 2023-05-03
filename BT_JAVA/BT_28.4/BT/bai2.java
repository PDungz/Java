import java.util.Scanner;

public class bai2 {
    public static void ps(String a, int b) throws Exception {
        if(a.length() > 25) {
            throw new Exception();
        } if(b < 1990 && b > 1995) {
            throw new Exception();
        } else {
            System.out.println("Ho ten: " + a);
            System.out.println("Nam sinh: " + b);
            System.out.println("Da kiem tra");
        }
    }

    public static void main(String[] args) {
        String hoten;
        int ns;
        System.out.println("CHuong trinh nhap ho ten va nam sinh: "); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho ten: ");
        hoten = sc.nextLine();
        System.out.print("Nam sinh: ");
        ns = sc.nextInt();
        
        try {
            ps (hoten, ns);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        } 
        System.out.println("Chay den day");
        sc.close();
    }
}
