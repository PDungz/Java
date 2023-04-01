import java.util.Scanner;

public class testCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        

        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        System.out.print("Nhap m la: ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print("\t\t");
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Tim so lon nhat trong mang va tong hai so chan
        int max = arr[0][0];
        int tongChan = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
                if(arr[i][j] % 2 == 0) {
                    tongChan += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println("So lon nhat trong mang la: " + max);
        System.out.println("Tong cac so chan co trong mang la: " + tongChan);

        System.out.println();
        System.out.println();

    }

}
