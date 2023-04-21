import java.util.Scanner;

public class quanLy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so giao dich: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        giaoDichTT[] gdtt = new giaoDichTT[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin giao dich                **");
            System.out.println("\t\t\t** 2. Xuat thong tin cac giao dich            **");
            System.out.println("\t\t\t** 3. Tong tien cac giao dich                 **");
            System.out.println("\t\t\t** 4. Ket thuc                                **");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t************************************************");
            System.out.println();
            System.out.println();

            System.out.print("Nhap chuc nang: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
                case 1:
                    System.out.println("Nhap thong tin giao dich " + (count + 1));
                    gdtt[count] = new giaoDichTT();
                    gdtt[count].inPut();
                    count++;
                    System.out.println("Nhap thong tin giao dich thanh cong!");
                    break;
                case 2:
                    if(count > 0) {
                        for(int i = 0; i < count; i++) {
                            gdtt[i].outPut();
                        }
                    } else {
                        System.out.println("Khong co giao dich nao!");
                    }
                    break;
                case 3:
                    if(count > 0) {
                        double tongTien_cacGD = 0d;
                        for(int i = 0; i < count; i++) {
                            tongTien_cacGD += gdtt[i].thanhTien();
                        }
                        System.out.println("Tong thanh ten cua cac giao dich: " + tongTien_cacGD);
                        
                    } else {
                        System.out.println("Khong co giao dich hang nao!");
                    }
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("Ban da thoat khoi chuong trinh!                 ");
                    System.out.println("------------------------------------------------");
                    found = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println("Nhap n vai o                                    ");
                    System.out.println("------------------------------------------------");

                    break;
            }
        }
    }
}
