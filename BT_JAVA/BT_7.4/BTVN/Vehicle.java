import java.util.Scanner;

public class Vehicle {
    private String mauXe;
    private String giaThanh;
    private String hangXe;

    public Vehicle() {

    }

    public Vehicle(String mauXe, String giaThanh, String hangXe) {
        this.mauXe = mauXe;
        this.giaThanh = giaThanh;
        this.hangXe = hangXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public String getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(String giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("MauXe: ");
        this.mauXe = sc.nextLine();
        System.out.print("Gia Thanh: ");
        this.giaThanh = sc.nextLine();
        System.out.print("HangXe: ");
        this.hangXe = sc.nextLine();
    }

    public void outPut() {
        System.out.println();
        System.out.println();
        System.out.println("MauXe: " + this.mauXe);
        System.out.println("Gia Thanh: " + this.giaThanh);
        System.out.println("HangXe: " + this.hangXe);
    }
}
