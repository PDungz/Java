import java.util.Scanner;

public class Car extends Vehicle {
    private int soGhe;
    private String loaiMay;
    
    public Car() {
        super();
    }

    public Car(String mauXe, String giaThanh, String hangXe, int soGhe, String loaiMay) {
        super(mauXe, giaThanh, hangXe);
        this.soGhe = soGhe;
        this.loaiMay = loaiMay;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public void setLoaiMay(String loaiMay) {
        this.loaiMay = loaiMay;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in); 
        System.out.print("So Ghe: ");
        this.soGhe = sc.nextInt();
        sc.nextLine();
        System.out.print("Loai May: ");
        this.loaiMay = sc.nextLine();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("So Ghe: " + this.soGhe);
        System.out.println("Loai May: " + this.loaiMay);
    }

}
