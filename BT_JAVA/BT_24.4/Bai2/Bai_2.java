import java.util.Scanner;

class Student {
	private long msv;
	private String hoTen;
	private float diemLT;
	private float diemtTH;
	
	public Student() {
		
	}
	
	public Student(long msv, String hoTen, float diemLT, float diemtTH) {
		super();
		this.msv = msv;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemtTH = diemtTH;
	}
	
	public long getMsv() {
		return msv;
	}
	public void setMsv(long msv) {
		this.msv = msv;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	
	public float getDiemtTH() {
		return diemtTH;
	}
	public void setDiemtTH(float diemtTH) {
		this.diemtTH = diemtTH;
	}
	
	public double tinhDiemTB() {
		return (getDiemLT() * getDiemtTH()) / 2;
	}

	@Override
	public String toString() {
		return "Student [getMsv()=" + getMsv() + ", getHoTen()=" + getHoTen() + ", getDiemLT()=" + getDiemLT()
				+ ", getDiemtTH()=" + getDiemtTH() + ", tinhDiemTB()=" + tinhDiemTB() + "]";
	}
	
	
}

public class Bai_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Tao sv 1
		Student sv1 = new Student(1911, "HuyNl", 10, 10);
		
		// Tao sv 2
		Student sv2 = new Student(30415, "NgayGiaiPhong", 10, 10);
		
		// Tao sv3
		Student sv3 = new Student();
		
		System.out.print("Nhap Ma SV: ");
		sv3.setMsv(sc.nextLong());
		sc.nextLine();
		
		System.out.print("Nhap Ho Ten: ");
		sv3.setHoTen(sc.nextLine());
		
		System.out.print("Nhap diem LT: ");
		sv3.setDiemLT(sc.nextFloat());
		
		System.out.print("Nhap diem TH: ");
		sv3.setDiemtTH(sc.nextFloat());
		
		// In danh sach sinh vien
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		
	}
}
