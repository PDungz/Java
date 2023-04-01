import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem TB la: ");
        float Tb = sc.nextFloat();
        if(Tb > 0f && Tb <= 10f) {
            if(Tb > 8.0f) {
                System.out.println("xep loai gioi");
            }
            else if(Tb >= 6.5f && Tb < 8.0f){
                System.out.print("xep loai kha");
            }
            else if(Tb < 5.0f && Tb >= 0f){
                System.out.print("xep loai yeu");
            }

        } else {
            System.out.println("m Nhap ngu vai!");
        }
    }
}
