import java.util.Scanner;

public class Bai_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			try {
	            System.out.print("Nhap a la: ");
	            int a = sc.nextInt();
	            System.out.print("Nhap b la: ");
	            int b = sc.nextInt();
	            System.out.println("Ket qua: " + (a/b));
			} catch (ArithmeticException e) {
				System.out.println("Loi! So nhap vao khong phai kieu 1 / 0 " + e.toString());
			}

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Loi! So nhap vao khong phai kieu so nguyen " + e.toString());
        }
	}
}