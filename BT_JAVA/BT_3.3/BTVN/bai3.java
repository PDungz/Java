import java.util.Scanner;

public class bai3 { // Bai 3 trong BTVN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countAB = 0;
        System.out.println(str);   
        System.out.println();    
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
                countAB++;
            }
        }
        System.out.println("So lan xuat hien cua 'ab' la: " + countAB); 
    }
}
