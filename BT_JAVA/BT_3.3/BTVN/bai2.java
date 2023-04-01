import java.util.Scanner;

public class bai2 { // Bai 2 trong bai tap ve nha
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }


        System.out.print("Nhap c la: ");
        int c = sc.nextInt();
        int countNho_c = 0;
        int countLon_c = 0;
        int countBang_c = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > c) {
                countLon_c++;
            }
            if(arr[i] == c) {
                countBang_c++;
            }
            if(arr[i] < c) {
                countNho_c++;
            }
        }

        System.out.println("Co " + countLon_c + " co gia tri lon hon " + c);  
        System.out.println("Co " + countBang_c + " co gia tri lon bang " + c);  
        System.out.println("Co " + countNho_c + " co gia tri lon nho " + c);  
    }
}
