import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loai;

    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(String maGD, String ngayGD, long donGia, float dienTich, String loai) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override 
    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai dat giao dich: ");
        this.loai = sc.next();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Loai datf giao dich: " + getLoai());
        System.out.println("Thanh tien giao dich: " + ThanhTien());
    }

    public double ThanhTien() {
        if(getLoai().equalsIgnoreCase("B") || getLoai().equalsIgnoreCase("C")) {
            return getDienTich() * getDonGia();
        } else if(getLoai().equalsIgnoreCase("A")) {
            return getDienTich() * getDonGia() * 1.5;
        }
        return 0;
    }
}
