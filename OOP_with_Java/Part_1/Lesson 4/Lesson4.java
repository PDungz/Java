import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen la: ");
        int n = sc.nextInt();
        SoNguyenTo snt = new SoNguyenTo(n);
        snt.setSoNguyenTo(n);
        System.out.println("Neu n la so ngto tra ve n neu khong tra ve 1: " + snt.getSoNguyenTo());
        System.out.println("In so ngto tiep theo cua a neu a la so ngto neu k tra ve 1: " + snt.timSoNguyenToTiepTheo());
    }
}
