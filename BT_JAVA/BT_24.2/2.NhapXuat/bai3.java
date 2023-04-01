import java.util.Scanner;

public class bai3 { // bai 3 phan nhap xuat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float p = (a + b + c)/2;
        System.out.print("Dien tich: " + (Math.sqrt(p*(p-a)*(p-b)*(p-c))));
    }
}