import java.util.Scanner;

public class MayIn extends May {
    private double TocDoIn;
    private double DoPhanGia;

    public MayIn() {

    }

    public MayIn(String TenNSX, String DiaChi, String NhanHieu, long GiaThanh, double TocDoIn, double DoPhanGia) {
        super(TenNSX, DiaChi, NhanHieu, GiaThanh);
        this.TocDoIn = TocDoIn;
        this.DoPhanGia = DoPhanGia;
    }

    public double getTocDoIn() {
        return TocDoIn;
    }

    public void setTocDoIn(double TocDoIn) {
        this.TocDoIn = TocDoIn;
    }

    public double getDoPhanGia() {
        return DoPhanGia;
    }

    public void setDoPhanGia(double DoPhanGia) {
        this.DoPhanGia = DoPhanGia;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Toc do in: ");
        this.TocDoIn = sc.nextDouble();
        System.out.println("Nhap Do phan giai: ");
        this.DoPhanGia = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Toc do may in: " + TocDoIn);
        System.out.println("Do phan gia: " + DoPhanGia);
    }
}
