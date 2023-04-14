import java.util.Scanner;

public class Teacher extends Person {
    private String lop;
    private long luong;
    private double soGioDay;

    public Teacher() {

    }

    public Teacher(String name, String gioiTinh, String birthday, String diaChi, String lop, long luong, double soGioDay) {
        super( name, gioiTinh, birthday, diaChi);
        this.lop = lop;
        this.luong = luong;
        this.soGioDay = soGioDay;

    }
    
    public String getLop() {
        return lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public double getSoGioDay() {
        return soGioDay;
    }

    public void setsoGioDay(double soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.print("Lop: ");
        this.lop = sc.nextLine();
        System.out.print("Luong: ");
        this.luong = sc.nextLong();
        sc.nextLine();
        System.out.print("So gio day trong thang: ");
        this.soGioDay = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Lop: " + this.lop);
        System.out.println("Luong: " + this.luong);
        System.out.println("So gio day trong thang: " + this.soGioDay);
        System.out.println("Luong thuc: " + LuongThuc());
    }

    public double LuongThuc() {
        if(lop.equals("TOI")) {
            return luong * soGioDay * 1.2;
        } else {
            return luong * soGioDay;
        }
    }
}
