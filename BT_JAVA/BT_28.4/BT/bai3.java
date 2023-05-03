import java.util.*;
import java.lang.*;

public class bai3 {
	public static int nhapso() throws Exception {
		int so;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		String str = sc.nextLine();
		if(str.trim().isEmpty()) {
			throw new Exception("Ban chua nhap chu so hoac khaong trang");
		}
		so =  Integer.parseInt(str);
		
		return so;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n;
			System.out.println("Nhap n = ");
			n = sc.nextInt();
			System.out.println(n + " ");
		} catch (NumberFormatException e) {
			System.out.println("Loi: Day nhap vao khong phai la so");
		} catch(Exception e) {
			System.out.println("Loi: " + e.getMessage());
		}
	}
}