import java.util.Scanner;

public class bai1 { // bai vd 1 va 2 cho vong lap while va do while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
        }while( n < 10);

        System.out.println("Ln hon 10 " + n);
    }
}