import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n la: ");
        int n = sc.nextInt();

        // int sumN = 0;
        // for(int i = 1; i <= n; i++) {
        //     sumN += i;
        // }
        // System.out.println("Tong n so tu nhien dau tien la: " + sumN);

        // int sumChan = 0;
        // int count = 0;
        // for(int i = 0; i <= n; i++) {
        //     if(i % 2 == 0) {
        //         sumChan += i;
        //     System.out.println(" i =  " + i);
        //         count++;
        //     } 
        //     if(count == 5) {
        //         break;
        //     }
        // }
        // System.out.println("Tong 5 so chan dau tien la: " + sumChan);

        // float s = 0f;
        // float sumI = 0f;
        // for(int i = 1; i <= n; i++) {
        //     sumI += (float)i;
        //     System.out.println("i = " + i);
        //     System.out.println("sum = " + sumI);
        //     System.out.println("Tong S la: " + s);
        //     s += (float)(1/sumI);
        // }
        // System.out.println("Tong S la: " + s);
        
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

        // for(int i = 1; i < 6; i++) {
        //     if(i == 4) continue;
        //     System.out.println("i = " + i + " Sqrt i = " + Math.sqrt(i));
        // }

    }
}
