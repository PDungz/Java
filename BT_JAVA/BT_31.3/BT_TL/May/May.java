import java.util.Scanner;

public class May {
    private String TenNSX;
    private String DiaChi;
    private String NhanHieu;
    private long GiaThanh;

    public May() {

    }

    public May(String TenNSX, String DiaChi, String NhanHieu, long GiaThanh) {
        this.TenNSX = TenNSX;
        this.DiaChi = DiaChi;
        this.NhanHieu = NhanHieu;
        this.GiaThanh = GiaThanh;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDiaChi() {
        return DiaChi;
    } 

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getNhanHieu() {
        return NhanHieu;
    }

    public void setNhanHieu(String NhanHieu) {
        this.NhanHieu = NhanHieu;
    }

    public long getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(long GiaThanh) {
        this.GiaThanh = GiaThanh;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten NSX: ");
        this.TenNSX = sc.next();
        System.out.println("Nhap Dia chi: ");
        this.DiaChi = sc.next();
        System.out.println("Nhap Nhan hieu: ");
        this.NhanHieu = sc.next();
        System.out.println("Nhap Gia thanh: ");
        this.GiaThanh = sc.nextLong();
    }

    public void Output() {
        System.out.println();
        System.out.println("Ten NSX: " + TenNSX);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("Nhan hieu: " + NhanHieu);
        System.out.println("Gia thanh: " + GiaThanh);
    }
}
