import java.util.Scanner;

class Student {
	private String msv;
	private float diemTB;
	private int tuoi;
	private String lop;

	public Student() {

	}

	public Student(String msv, float diemTB, int tuoi, String lop) {
		this.msv = msv;
		this.diemTB = diemTB;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public void setMSV(String msv) {
		this.msv = msv;
	}

	public String getMSV() {
		return msv;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getLop() {
		return lop;
	}

	public String getHB() {
		if(diemTB >= 8) {
			return "co";
		} else {
			return "khong";
		}
	}

	public void inputInfo(String msv, float diemTB, int tuoi, String lop) {
		this.msv = msv;
		this.diemTB = diemTB;
		this.tuoi = tuoi;
		this.lop = lop;
	}

	public void showInfo() {
		System.out.println("MSV: " + getMSV());
		System.out.println("DiemTB: " + getDiemTB());
		System.out.println("Tuoi: " + getTuoi());
		System.out.println("Lop: " + getLop());
		System.out.println("Hoc bong: " + getHB());
	}


}

public class Lesson2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sv: ");
		int n = sc.nextInt();
		Student[] sv = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thon tin SV thu " + (i+1));
			System.out.print("MSV: ");
			String Msv = sc.next();
			System.out.print("DiemTB: ");
			float DiemTB = sc.nextFloat();
			System.out.print("Tuoi: ");
			int Tuoi = sc.nextInt();
			System.out.print("Lop: ");
			String Lop = sc.next();
			System.out.println();
			sv[i] = new Student(Msv, DiemTB, Tuoi, Lop);
		}

		System.out.println();
		System.out.println();
		for(int i = 0; i < n; i++) {
			System.out.println("Sinh Vien Thu " + (i+1));
			sv[i].showInfo();
			System.out.println();
		}
	}
}