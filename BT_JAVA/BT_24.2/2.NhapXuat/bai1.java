import java.util.Scanner;

public class bai1 { // bai 1 phan nhap xuat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Phan nguyen cua 3 so a, b, c chi cho 2: " + (a/2) + " " + (b/2) + " " + (c/2));
        System.out.println("Phan du cua 3 so a, b, c chi cho 3: " + (a%3) + " " + (b%3) + " " + (c%3));
        System.out.println("Tang gia tri 3 bien len 1: " + (++a) + " " + (++b) + " " + (++c));


    }
}