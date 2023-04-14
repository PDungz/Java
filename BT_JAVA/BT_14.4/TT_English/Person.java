import java.util.Scanner;


public class Person {
    private String name;
    private String gioiTinh;
    private String birthday;
    private String diaChi;

    public Person() {

    }

    public Person(String name, String gioiTinh, String birthday, String diaChi) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.birthday = birthday;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBithrday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("gioiTinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Birday: ");
        this.birthday = sc.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public void outPut() {
        System.out.println();
        System.out.println();
        System.out.println("Name: " + this.name);
        System.out.println("Gioi Tinh: " + this.gioiTinh);
        System.out.println("Birthday: " + this.birthday);
        System.out.println("Dia Chi: " + this.diaChi);
    }
}
