import java.util.Scanner;

public class Account {
	private long soTK;
	private String tenTK;
	private double soTienTk;
	private double laiSuat = 0.035;
	
	public Account() {
		
	}
	
	public Account(long soTK, String tenTK) {
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTk = 50;
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoTienTk() {
		return soTienTk;
	}

	public void setSoTienTk(double soTienTk) {
		this.soTienTk = soTienTk;
	}
	
	public void napTien(double soTien) {
		this.soTienTk = this.soTienTk + soTien;
	}
	
	public void rutTien(double soTien) {
		this.soTienTk = this.soTienTk - soTien;
	}
	
	public void daoHan(int quy) {
		if(quy > 6) {
			this.soTienTk = this.soTienTk + this.soTienTk * this.laiSuat;
		}
	}
	
	public void chuyenTien(Account ac, double soTien) {
		if(this.soTienTk > 0 && this.soTienTk > soTien) {
			ac.napTien(soTien);
			this.soTienTk -= soTien;
			System.out.println("Chuyen khoan thanh cong.");
		} else {
			System.out.println("Khong the chuyen khoan!");
		}
		
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So tai khoan: ");
        this.soTK = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhap ten tai khoan: ");
        this.tenTK = sc.nextLine();
	}
	
	
	@Override
	public String toString() {
		return "Account [getSoTK()=" + getSoTK() + ", getTenTK()=" + getTenTK() + ", getsoTienTk()=" + getSoTienTk() + "VND"
				+ "]";
	}
		
}
