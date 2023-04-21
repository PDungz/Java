import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private long donGia;
    private float dienTich;

    public GiaoDich() {

    }

    public GiaoDich(String maGD, String ngayGD, long donGia, float dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;   
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giao dich: ");
        this.maGD = sc.next();
        System.out.print("Nhap ngay giao dich: ");
        this.ngayGD = sc.next();
        System.out.print("Nhap don gia giao dich: ");
        this.donGia = sc.nextLong();
        System.out.print("Nhap dien tich giao dich: ");
        this.dienTich = sc.nextFloat();
    }

    public void outPut() {
        System.out.println();
        System.out.println();
        System.out.println("MaGD: " + getMaGD());
        System.out.println("Ngay giao dich: " + getNgayGD());
        System.out.println("Don gia giao dich: " + getDonGia());
        System.out.println("Dien tich giao dich: " + getDienTich());
    }

}
