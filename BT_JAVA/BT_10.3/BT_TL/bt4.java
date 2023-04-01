import java.util.Scanner;

public class bt4 {
    // Nhap mang 
    public static void nhapMang(int []arr, int n) {
        for(int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    // Tinh tong cac pt trong mang
    public static int tongPtMang(int []arr, int n) {
        int tongPt = 0;
        for(int i = 0; i < n; i++) {
            tongPt += arr[i];
        }
        return tongPt;
    }

    // Tim pt lon nhat trong mang
    public static int ptMaxMang(int []arr, int n) {
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Sap xep lai mang theo thu tu tang dan
    public static void sapXepMang(int []arr, int n) {
        for(int i = n-1; i > 0; i--){
            Boolean swapped = true;
            for(int j = 0; j < i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = false;
                }
            }
            if(swapped){
                break;
            }
        }
    }

    // Xuat mang
    public static void xuatMang(int []arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + " ");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Nhap vao mang 1 chieu
        nhapMang(arr, n);
        // Xuat mang sau khi nhap
        System.out.println("Xuat mang sau khi nhap: ");
        xuatMang(arr, n);
        // Tinh tong cac pt trong mang
        System.out.println();
        System.out.println("Tong cac phan tu trong mang: " + tongPtMang(arr, n));
        // Tim phan tu lon nhat trong mang
        System.out.println("Phan tu lon nhat trong mang: " + ptMaxMang(arr, n));
        // Sap xep mang tang dan
        System.out.println();
        sapXepMang(arr, n);
        // Xuat mang ra man hinh
        System.out.println("Xuat mang sau khi sap xep: ");
        xuatMang(arr, n);
    }
}
