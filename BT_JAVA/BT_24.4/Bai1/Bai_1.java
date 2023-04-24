import java.util.Scanner;

class HinhChuNhat {
	private double chieudai;
	private double chieurong;
	
	
	public HinhChuNhat() {

	}


	public HinhChuNhat(double chieudai, double chieurong) {
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}


	public double getChieudai() {
		return chieudai;
	}


	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}


	public double getChieurong() {
		return chieurong;
	}


	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	
	public double chuVi() {
		return 2 * (getChieudai() + getChieurong());
	}
	
	public double dienTich() {
		return getChieudai() * getChieurong();
	}


	@Override
	public String toString() {
		return "HinhChuNhat [getChieudai()=" + getChieudai() + ", getChieurong()=" + getChieurong() + ", chuVi()="
				+ chuVi() + ", dienTich()=" + dienTich() + "]";
	}
	
	
}


public class Bai_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Constructor khong tham so
		System.out.println("Constructor khong tham so");
		HinhChuNhat hcn = new HinhChuNhat();
		
		System.out.print("Nhap chieu dai: ");
		hcn.setChieudai(sc.nextDouble());
		
		System.out.print("Nhap chieu rong: ");
		hcn.setChieurong(sc.nextDouble());

		System.out.println(hcn.toString());
		
		// Constructor co tham so
		System.out.println("Constructor co tham so:");
		HinhChuNhat hcn1 = new HinhChuNhat(5, 6);
		System.out.println(hcn1.toString());
			
		
	}
}


