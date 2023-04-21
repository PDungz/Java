import java.util.Scanner;

public class ThucHienGD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so Giao Dich: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        GiaoDichDat[] Gdich = new GiaoDichDat[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin Giao Dich Dat            **");
            System.out.println("\t\t\t** 2. Xuat thong tin Giao Dich Dat            **");
            System.out.println("\t\t\t** 3. Xuat cac Giao Dich hon 2ty              **");
            System.out.println("\t\t\t** 4. Thoat                                   **");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t************************************************");
            System.out.println();
            System.out.println();

            System.out.print("Nhap chuc nang: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
                case 1:
                    System.out.println("Nhap thong tin giao dich: " + (count + 1));
                    Gdich[count] = new GiaoDichDat();
                    Gdich[count].inPut();
                    count++;
                    System.out.println("Nhap thong tin giao dich thanh cong");
                    break;
                case 2:
                    if(count > 0) {
                        for(int i = 0; i < count; i++) {
                            Gdich[i].outPut();
                        }
                    } else {
                        System.out.println("Khong co giao dich hang nao!");
                    }
                    break;
                case 3:
                    if(count > 0) {
                        System.out.println("Giao dich hon 2ty la: ");
                        for(int i = 0; i < count; i++) {
                            if(Gdich[i].ThanhTien() > 2000) {
                                Gdich[i].outPut();
                            }
                        }
                        
                    } else {
                        System.out.println("Khong co giao dich hang nao!");
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------------------");
                    System.out.println("Chuc mung ban da cut khoi chuong trinh");
                    System.out.println("------------------------------------------------");
                    found = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    System.out.println("Nhap n vai o");
                    System.out.println("------------------------------------------------");

                    break;
            }
        }
    }
}
