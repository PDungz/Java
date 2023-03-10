import java.util.Scanner;

public class TestMyCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x la: ");
        int x0 = sc.nextInt();
        System.out.print("Nhap y la: ");
        int y0 = sc.nextInt();

        // Khoi tao point
        MyPoint pointCl = new MyPoint();
        pointCl.setPoint(x0, y0);

        // Khoi tao Circle
        MyCircle circle = new MyCircle();
        System.out.print("Nhap r la: ");
        int r0 = sc.nextInt();

        // Test phuong thuc nhap
        circle.setMyCircle(pointCl, r0);
        
        //In ra thong tin cua hinh tron
        System.out.println(circle.toString());

        // Test phuong thuc tinh dien tich hinh tron
        System.out.println("Dien tich hinh tron la: " + circle.getArea());
    }
}
