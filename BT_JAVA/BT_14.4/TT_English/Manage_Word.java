import java.util.Scanner;

public class Manage_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so Giang Vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        Teacher[] Tcher = new Teacher[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin Giang Vien               **");
            System.out.println("\t\t\t** 2. Xuat thong tin Giang Vien               **");
            System.out.println("\t\t\t** 3. Tim giang vien co luong cao nhat        **");
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
                    System.out.println("Nhap Giang Vien hang thu " + (count + 1));
                    Tcher[count] = new Teacher();
                    Tcher[count].inPut();
                    count++;
                    System.out.println("Nhap thong tin Giang Vien thanh cong");
                    break;
                case 2:
                    if(count > 0) {
                        for(int i = 0; i < count; i++) {
                            Tcher[i].outPut();
                        }
                    } else {
                        System.out.println("Khong co Giang Vien hang nao!");
                    }
                    break;
                case 3:
                    if(count > 0) {
                        double luongMax = Tcher[0].LuongThuc();
                        int found_tcher = 0;
                        for(int i = 1; i < count; i++) {
                            if(Tcher[i].LuongThuc() > luongMax) {
                                luongMax = Tcher[i].LuongThuc();
                                found_tcher = i;
                            }
                        }
                        System.out.println("Giang vien co so luong cao nhat la: ");
                        Tcher[found_tcher].outPut();
                    } else {
                        System.out.println("Khong co Giang Vien hang nao!");
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
