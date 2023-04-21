import java.util.Scanner;

public class giaoDichTT extends giaoDich {
    private float tiGia;
    private String loaiTT;
    private Long thanhTien;
    
    public giaoDichTT() {
        
    }

    public giaoDichTT(String maGD, String ngayGD, Long soluong, Long donGia, float tiGia, String loaiTT, long thanhTien) {
        super(maGD, ngayGD, soluong, donGia);
        this.tiGia = tiGia;
        this.loaiTT = loaiTT;
        this.thanhTien = thanhTien;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    
    public String getLoaiTT() {
        return loaiTT;
    }

    public void setLoaiTT(String loaiTT) {
        this.loaiTT = loaiTT;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double thanhTien(){
        if (getLoaiTT().equals("USD") || getLoaiTT().equals("Euro")){
            return getSoLuong() *getDonGia() * tiGia;
        }
        else if(getLoaiTT().equals("VND")){
            return getSoLuong() * getDonGia();
        }
        return 0;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ti Gia: ");
        this.tiGia = sc.nextFloat();
        sc.nextLine();
        System.out.print("Loai Tien Te: ");
        this.loaiTT = sc.next();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Ti Gia: " + getTiGia());
        System.out.println("Loai Tien Te: " + getLoaiTT());
        System.out.println("Thanh Tien: " + thanhTien());
    }


}
