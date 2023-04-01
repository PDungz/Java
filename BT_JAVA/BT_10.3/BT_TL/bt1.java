import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        sc.close();
        long S = 0l;

        if(n < 0) {
            System.out.println("So " + n + " nhap vao khong phai la so nguyen duong");
        } else {
            for(int i = 1; i <= n; i++) {
                S += Math.pow(i,2);
            }
            System.out.println("Tong so S(n) la: " + S);
        }
    }
}
