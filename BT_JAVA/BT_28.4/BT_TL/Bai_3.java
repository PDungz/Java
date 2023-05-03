import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Ket qua: " + 10/0);
		} catch (ArithmeticException ex) {
			System.out.println("Loi! So chi cho 0 : " + ex.toString());
		}
	}
}