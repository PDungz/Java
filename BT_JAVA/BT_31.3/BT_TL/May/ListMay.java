import java.util.Scanner;

public class ListMay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So luong may: ");   
        int n = sc.nextInt();

        MayIn []mI = new MayIn[n];

        for(int i = 0; i < n; i++) {
            mI[i] = new MayIn();
            mI[i].Input();
            System.out.println();
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            mI[i].Output();
            System.out.println();
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            if(mI[i].getTenNSX().equals("Canon")) {
                mI[i].Output();
            System.out.println();
            System.out.println();
            }
        }
    }    
}
