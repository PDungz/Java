import java.util.Scanner;

public class Bai_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so xe: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        Vehicle[] xe = new Vehicle[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin cac xe                   **");
            System.out.println("\t\t\t** 2. Xuat thong tin cac xe                   **");
            System.out.println("\t\t\t** 3. Thoat                                   **");
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
                    xe[count] = new Vehicle();
                    xe[count].nhapThongTin();
                    count++;
                    System.out.println("Nhap thong tin giao dich thanh cong");
                    break;
                case 2:
                    if(count > 0) {
                    	System.out.printf("|%20s|%10s|%8s|%10s|\n", "Ten chu xe", "Loai xe", "Dung tich", "Gia xe");
                        for(int i = 0; i < count; i++) {
                            xe[i].xuatThongTin();
                        }
                    } else {
                        System.out.println("Khong co giao dich hang nao!");
                    }
                    break;
                case 3:
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
