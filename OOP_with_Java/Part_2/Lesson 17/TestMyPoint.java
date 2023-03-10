import java.util.Scanner;

public class TestMyPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x la: ");
        int x0 = sc.nextInt();
        System.out.print("Nhap y la: ");
        int y0 = sc.nextInt();

        // Khoi tao point
        MyPoint point = new MyPoint();

        // Test ham nhap diem
        point.setPoint(x0, y0);

        // Test ham in ra thong tin cua Point
        point.ToString();
        
        // Test phuong thuc tinh khoang cach hai diem
        System.out.println("Khoang cach cua hai diem la: " + point.distance(x0, y0));
        
        // Test phuong thuc tai chong distance
        MyPoint point1 = new MyPoint(2, 3);
        System.out.println("Khoang cach cua hai diem la: " + point.distance(point1));
    }
}
