import java.util.Scanner;

public class testLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Nhap mang arr[]
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt(); 
        }

        // In cac gia tri cua mang arr[]
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + " ");
        }
        
        // Tinh tong cac phan tu trong mang a[]
        System.out.println();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang arr[] la: " + sum);

        // Sap xep cac gia tri trong mang arr[] theo thu tu tang dan
        System.out.println();
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

        // In mang arr[] sau khi sap xep
        System.out.println();
        System.out.println("In mang arr[] sau khi sap xep: ");
        for(int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + " ");
        }

        // Tim gia tri max min trong mang arr[]
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Gia tri max trong arr[] la: " + max);
        System.out.println("Gia tri min trong arr[] la: " + min);
    }
    
}
