import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap a la: ");
            int a = sc.nextInt();
            System.out.print("Nhap b la: ");
            int b = sc.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Loi! So nhap vao khong phai kieu so nguyen " + e.toString());
        }
    }
}
