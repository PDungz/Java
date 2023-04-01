import java.util.Scanner;

class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {

    }

    public PhanSo(int tuSo, int mauSo) {
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
}

class MangPhanSo {
    private PhanSo pSo;

    public MangPhanSo() {

    }

    public MangPhanSo(PhanSo pSo) {
        this.pSo = pSo;
    }

    public PhanSo getPhanSo() {
        return this.pSo;
    }

    public void setPhanSo(PhanSo pSo) {
        this.pSo = pSo;
    }

    public void display() {
        System.out.println("Tu so/Mau So = " + pSo.getTuSo() + "/" + pSo.getMauSo());
    }
}

public class bt3 {
    public static void main(String[] args) {
        MangPhanSo []mps = new MangPhanSo[2];
        PhanSo pSo1 = new PhanSo(1, 2);
        PhanSo pSo2 = new PhanSo(3, 4);
        mps[0] = new MangPhanSo(pSo1);
        mps[1] = new MangPhanSo(pSo2);

        mps[0].display();
        mps[1].display();
        
    }
}
