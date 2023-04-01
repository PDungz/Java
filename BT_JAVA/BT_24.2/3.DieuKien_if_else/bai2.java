import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0) {
            if(b == 0) {
                System.out.print("Pt vo so nghiem");
            } else {
                System.out.print("Pt vo nghiem");
            }
        } else {
            System.out.print("Pt co  nghiem x = " + (-b/a));
        }
    }
}