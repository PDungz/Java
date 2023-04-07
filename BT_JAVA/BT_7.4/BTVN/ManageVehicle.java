import java.util.Scanner;

public class ManageVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong xe: ");
        int n = sc.nextInt();
        sc.nextLine();
        boolean found = true;
        int count = 0;
        Car[] car = new Car[n];

        while(found) {
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t**********************MENU**********************");
            System.out.println("\t\t\t**                                            **");
            System.out.println("\t\t\t** 1. Nhap thong tin xe oto                   **");
            System.out.println("\t\t\t** 2. Xuat thong tin xe oto                   **");
            System.out.println("\t\t\t** 3. Ket thuc                                **");
            System.out.println("\t\t\t************************************************");
            System.out.println();
            System.out.println();

            System.out.print("Nhap chuc nang: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
                case 1:
                    System.out.println("Nhap khach hang thu " + (count + 1));
                    car[count] = new Car();
                    car[count].inPut();
                    count++;
                    System.out.println("Khach hang da thue phong thanh cong");
                    break;
                case 2:
                    if(count > 0) {
                        for(int i = 0; i < count; i++) {
                            car[i].outPut();
                        }
                    } else {
                        System.out.println("Khong co khach hang nao!");
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
