import java.util.Scanner;

public class Bt_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();

        // Tinh tong gia tri cua day so n 
        int sumN = 0;
        for(int i = 1; i <= n; i++) {
            sumN += i;
        }
        System.out.println("Tong n so tu nhien dau tien la: " + sumN);

        // Tinh tong 5 so chan day tien
        System.out.println();   
        int sumChan = 0;
        int count = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                sumChan += i;
                count++;
            } 
            if(count == 5) {
                break;
            }
        }
        System.out.println("Tong 5 so chan dau tien la: " + sumChan);


        // Tinh tong day so S = 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+ .. +n)
        System.out.println();   
        float s = 0f;
        float sumI = 0f;
        for(int i = 1; i <= n; i++) {
            sumI += (float)i;
            s += (float)(1/sumI);
        }
        System.out.println("Tong S la: " + s);
        
        // In ra day so fibonaci co so cuoi cung nho hon hoac bang n
        System.out.println();   
        int a = 1;
        int b = 1;
        int fn = 1;
        System.out.print(fn + " ");
        System.out.print(fn + " ");
        for(int i = 2; i <= n; i++) {
            a = fn;
            fn = a + b;
            b = a;
            if(fn <= n) {
                System.out.print(fn + " ");
            }
        }

        // In ra man hinh cac so 1 -> 5 va can bac hai cua chung nhung k in ra so 4
        System.out.println();   
        for(int i = 1; i < 6; i++) {
            if(i == 4) continue;
            System.out.println("i = " + i + " Sqrt i = " + Math.sqrt(i));
        }

    }
}
