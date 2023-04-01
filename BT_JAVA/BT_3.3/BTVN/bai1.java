import java.util.Scanner;

public class bai1 { // Bai 1 trong BTVN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int t = 1;
            if(arr[i] == 1) t = 0;
            if(arr[i] != 1) {
                for(int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if(arr[i] % j == 0) {
                        t = 0;
                    }
                }
            }
            if(t == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
