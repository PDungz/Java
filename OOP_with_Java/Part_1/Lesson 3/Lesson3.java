// bai 3
import java.util.Scanner;

class HocBong {
    private String dk_HDSE;
    private float diemTK;
    private String nQuy;
    private int  kiThi;

    public HocBong() {

    }
    
    public HocBong(String dk_HDSE, float diemTK, String nQuy, int kiThi) {
        this.dk_HDSE = dk_HDSE;
        this.diemTK = diemTK;
        this.nQuy = nQuy;
        this.kiThi = kiThi;
    } 

    public void kiTraHB() {
        if(dk_HDSE.equals("co") && (float)diemTK >= 0.75f && nQuy.equals("khong") && (int)kiThi == 0) {
            System.out.println("Hoc sinh nay dat Hoc Bong cua trung tam Aptech"); 
        } else {
            System.out.println("Hoc sinh nay khong dat Hoc Bong cua trung tam Aptech"); 
        }
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhap thong tin cua sinh vien");
            System.out.print("Dang ky khoa hoc HDSE: ");
            String dk = sc.next();
            System.out.print("Diem tong ket cua sinh vien: ");
            float DiemTK = sc.nextFloat();
            System.out.print("Vi pham noi Quy cua trung tam: ");
            String noiQuy = sc.next();
            System.out.print("So lan thi lai cua mot ki: ");
            int soLT = sc.nextInt();
            HocBong sv = new HocBong(dk, DiemTK, noiQuy, soLT);
            sv.kiTraHB();
    }
}