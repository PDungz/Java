import java.util.*;

import javax.swing.plaf.synth.SynthUI;

public class bt4 {
    private String Ten_NSX;
    private String  Dia_chi;
    private String Nhan_hieu;
    private int Gia_thanh;

    public bt4() {

    }

    public bt4(String Ten_NSX, String Dia_chi, String Nhan_hieu, int Gia_thanh) {
        this.Ten_NSX = Ten_NSX;
        this.Dia_chi = Dia_chi;
        this.Nhan_hieu = Nhan_hieu;
        this.Gia_thanh = Gia_thanh;
    }

    public void setTenNSX(String Ten_NSX) {
        this.Ten_NSX = Ten_NSX;
    }

    public String getTenNSX() {
        return this.Ten_NSX;
    }

    public void setDiaChi(String Dia_chi) {
        this.Dia_chi = Dia_chi;
    }

    public String getDiaChi() {
        return this.Dia_chi;
    }

    public void setNhanHieu(String Nhan_hieu) {
        this.Nhan_hieu = Nhan_hieu;
    }

    public String getNhanHieu() {
        return this.Nhan_hieu;
    }

    public void setGiaThanh(int Gia_thanh) {
        this.Gia_thanh = Gia_thanh;
    }

    public int getGiaThanh() {
        return this.Gia_thanh;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten nsx: ");
        this.Ten_NSX = sc.next();
        System.out.print("Nhap Dia chi: ");
        this.Dia_chi = sc.next();
        System.out.print("Nhap Nhan hieu: ");
        this.Nhan_hieu = sc.next();
        System.out.print("Nhap Gia Thanh: ");
        this.Gia_thanh = sc.nextInt();
    }

    public void outPut() {
        System.out.println("Ten nsx: " + this.Ten_NSX);
        System.out.println("Dia chi: " + this.Dia_chi);
        System.out.println("Nhan hieu: " + this.Nhan_hieu);
        System.out.println("Gia thanh: " + this.Gia_thanh);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n la: ");
        int n = sc.nextInt();

        bt4 []MayIn = new bt4[n];

        for(int i = 0; i < n; i++) {
            MayIn[i] = new bt4();
            MayIn[i].inPut();
        }

        for(int i = 0; i < n; i++) {
            MayIn[i].outPut();
        }

    }
}
