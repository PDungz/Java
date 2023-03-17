import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        
        int count = 0;
        boolean blean = true;
        do{ 
            System.out.println("\n\n\n");
            System.out.println("\t\t\t***********************MENU********************");
            System.out.println("\t\t\t**                                           **");
            System.out.println("\t\t\t** 1. Add new product                        **");
            System.out.println("\t\t\t** 2. Remove product                         **");
            System.out.println("\t\t\t** 3. Iterate product list                   **");
            System.out.println("\t\t\t** 4. Search product                         **");
            System.out.println("\t\t\t** 5. Sort product                           **");
            System.out.println("\t\t\t** 6. Exit                                   **");
            System.out.println("\t\t\t**                                           **");
            System.out.println("\t\t\t***********************************************");
            System.out.println("\n\n\n");
            System.out.println("****************************************");
            System.out.print("\tNhap tuy chon la: ");
            int option = sc.nextInt();
            System.out.println("****************************************");
            System.out.println("\n\n\n");


            switch(option){
                case 1:
                    System.out.println("Add Product " + (count + 1) + " la: ");
                    shop.addProduct();
                    count++;
                    break;
                case 2:
                    if(count != 0) {
                        shop.removeProduct();  
                        count--;
                    } else {
                        noProduct();
                    }
                    break;
                case 3:
                    if(count != 0) {
                        shop.iteraterProduct();
                    } else {
                        noProduct();
                    }
                    break;
                case 4:
                    if(count != 0) {
                        shop.searchProduct();
                    } else {
                        noProduct();
                    }
                    break;
                case 5:
                    if(count != 0) {
                        shop.sortProduct();
                    } else {
                        noProduct();
                    }
                    break;

                case 6: 
                    blean = false;
                    System.out.println();
                    System.out.println("****************************************");
                    System.out.println("            Exit program!               ");
                    System.out.println("            Good Bye!                   ");
                    System.out.println("****************************************");
                    break;
                default:
                    System.out.println();
                    System.out.println("****************************************");
                    System.out.println("                                        ");
                    System.out.println("  You have selected the wrong fuction!  ");
                    System.out.println("  Please cloose again!                  ");
                    System.out.println("                                        ");
                    System.out.println("****************************************");
                    System.out.println();
                    break;
            }
        }while(blean == true);
    }   

    public static void noProduct() {
        System.out.println();
        System.out.println("****************************************");
        System.out.println("                                        ");
        System.out.println("               No product!              ");
        System.out.println("                                        ");
        System.out.println("****************************************");
        System.out.println();
    }
}
