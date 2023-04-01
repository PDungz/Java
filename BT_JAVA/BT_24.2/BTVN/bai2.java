import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("So " + n + " nhap vao la so nguyen Duong");
        } else {
            System.out.println("So " + n + " nhap vao la so nguyen am");
        }
    }
}
