import java.util.Scanner;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private double xiLanh;
	private double giaXe;

	public Vehicle() {
		super();
	}

	public Vehicle(String tenChuXe, String loaiXe, double xiLanh, double giaXe) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.xiLanh = xiLanh;
		this.giaXe = giaXe;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public double getXiLanh() {
		return xiLanh;
	}

	public void setXiLanh(double xiLanh) {
		this.xiLanh = xiLanh;
	}

	public double getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(double giaXe) {
		this.giaXe = giaXe;
	}
	
	public double thePhaiNop() {
		if(getXiLanh() < 100) {
			return (getGiaXe()/100);  
		} else if(getXiLanh() > 200) {
			return ((getGiaXe() * 5)/100);
		}
		return ((getGiaXe() * 3)/100);
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Chu xe: ");
        this.tenChuXe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        this.loaiXe = sc.nextLine();
        System.out.print("Nhap dung tich: ");
        this.xiLanh = sc.nextDouble();
        System.out.print("Nhap gia xe: ");
        this.giaXe = sc.nextLong();
	}
	
	public void xuatThongTin() {
		System.out.printf("|%20s|%10s|%6.2f|%10.1f|\n",getTenChuXe(), getLoaiXe(), getXiLanh(), getGiaXe());
	}
	
}
