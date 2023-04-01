import java.util.Scanner;

public class bt2 {
    private int tuSo;
    private int mauSo;

    public bt2() {

    }

    public bt2(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return this.tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return this.mauSo;
    }

    public void setMauSo(int mauSo) {
        if(mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Phan so nhap vao bi loi!");
        }
    }

    public void display() {
        System.out.println("tuSo / mauSo = " + this.tuSo + " / " + this.mauSo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int tSo = sc.nextInt();
        System.out.print("Nhap mau so: ");
        int mSo = sc.nextInt();

        // bt2 ps1 = new bt2(tSo, mSo);
        bt2 ps1 = new bt2();
        ps1.setTuSo(tSo);
        ps1.setMauSo(mSo);
        ps1.display();
        
    }

}
