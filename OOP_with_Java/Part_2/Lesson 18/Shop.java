import java.util.Scanner;
import java.util.ArrayList;


public class Shop {
    private ArrayList<Product> ProductList = new ArrayList<Product>();

    public Shop() {

    }

    // Method Add Product
    public void addProduct() {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        // Input Name
        System.out.print("Name Product: ");
        String namePrdt = sc.nextLine(); product.setName(namePrdt);

        // Input Description
        System.out.print("Description Product: ");
        String descriptionPrdt = sc.nextLine(); product.setDescription(descriptionPrdt);

        // Input Price
        System.out.print("Price Product: ");
        double pricePrdt = sc.nextDouble(); product.setPrice(pricePrdt);

        // Input Rate
        System.out.println("Rate Product: "); product.setRate();

        // Add product 
        ProductList.add(product);
        System.out.println();
        System.out.println("Add product successfully!");
    }


    // Method remove product
    public void removeProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Search Name Product remove: ");
        String NamePrtRemove = sc.next(); 
        boolean check = false;
        
        for(int i = 0; i < ProductList.size(); i++) {
            if(ProductList.get(i).getName().equals(NamePrtRemove)) {
                ProductList.remove(i);
                check = true;
                System.out.println("Remove product "+ i + " successfully!");
            }
            if(check == true) break;
        }
        if(check == false) {
            System.out.println("No product found!"); 
        }   
    }

    // Method iterater product
    public void iteraterProduct() {
        for(int i = 0; i < ProductList.size(); i++) {
            System.out.println("Product " + (i+1) + " :");
            ProductList.get(i).viewInfo();
            System.out.println();
        }
    }

    // Method search product
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoang gia muon tim kiem(a -> b): ");
        System.out.print("Nhap a la: "); 
        double a = sc.nextDouble();
        System.out.print("Nhap b la: "); 
        double b = sc.nextDouble();

        boolean check = false;
        for(int i = 0; i < ProductList.size(); i++) {
            if(ProductList.get(i).getPrice() > a && ProductList.get(i).getPrice() < b) {
                System.out.println("Search product successfully!");
                System.out.println();
                System.out.println("Product " + i + " :");
                ProductList.get(i).viewInfo();
                check = true;
            }
            if(check == true) break;
        }
        if(check == false) {
            System.out.println("No product found!");
        }
    }

    // Method sort product
    public void sortProduct() {
        Product temp = new Product();
        for(int i = ProductList.size(); i > 0; i--){
            Boolean swapped = true;
            for(int j = 0; j < i - 1;j++){
                if(ProductList.get(j).getPrice() > ProductList.get(j + 1).getPrice()){
                    temp = ProductList.get(j);
                    ProductList.set(j, ProductList.get(j+1));
                    ProductList.set(j+1, temp);
                    swapped = false;
                }
            }
            if(swapped){
                break;
            }
        }
    }

}
