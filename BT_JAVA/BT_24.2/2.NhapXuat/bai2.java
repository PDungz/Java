import java.util.Scanner;

public class bai2 { // bai 2 phan nhap xuat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        float deta, x1, x2;

        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("Pt Vo so nghiem");
                } else {
                    System.out.println("Pt vo ngiem");
                }
            } else {
                System.out.println("Pt co 1 nghiem la: " + (-c/b));
            }
        }

        else {
            deta = b*b - 4*a*c;
            if(deta < 0) {
                System.out.println("Pt vo nghiem");
            } else if( deta == 0) {
                System.out.println("Pt co 1 nghiem kep x = " + (-b/(2*a)));
            } else if(deta > 0) {
                x1 = (float)(-b + (Math.sqrt(deta)))/(2*a);
                x2 = (float)(-b - (Math.sqrt(deta)))/(2*a);
                System.out.println("Pt co hai nghiem la: " + "x1 = " + x1 + " " + "x2 = " + x2);
            }
        }
    }
}