import java.util.Scanner;

class SinhVien {
	private String msv;
	private String hoTen;
	private float diemTB;

	public SinhVien() {
		this.msv = "";
		this.hoTen = "";
		this.diemTB = 0.0f;
	}

	public SinhVien(String msv,String hoTen, float diemTB) {
		this.msv = msv;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public void InputIfo() {
		Scanner sc = new Scanner(System.in);

		System.out.print("MSV: ");
		this.msv = sc.nextLine();
		System.out.print("Ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Diem TB: ");
		this.diemTB = sc.nextFloat();
	}

	public void display() {
		System.out.println("MSV: " + this.msv);
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Diem TB: " + this.diemTB);
	}
}

public class KiemTra {
	public static void main(String[] args) {
		// K truyen vao doi so
		System.out.println("\n\n*********************************************");
		System.out.println("\nHam tao k doi so: ");
		SinhVien sv1 = new SinhVien();
		sv1.display();
		System.out.println("*********************************************");

		// Co truyen vao doi so
		System.out.println("\n\n*********************************************");
		System.out.println("\nHam tao co doi so ");
		SinhVien sv2 = new SinhVien("21111064579", "Phung Van Dung", 10f);
		System.out.println("\nXuat Thong tin sv: ");
		sv2.display();
		System.out.println("*********************************************");

		// Doi tuong goi toi phuong thuc nhap xuat
		System.out.println("\n\n*********************************************");
		SinhVien sv3 = new SinhVien();
		System.out.println("\nNhap Thong tin sv: ");
		sv3.InputIfo();
		System.out.println("\nXuat Thong tin sv: ");
		sv3.display();
		System.out.println("*********************************************");
	}
}