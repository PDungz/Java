import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private double price;
    private int []rate = new int[100];

    public Product()  {

    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setRate() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Luot danh gia " + (i + 1)+ " la: ");
            rate[i] = sc.nextInt();
        }
    }

    public double getRateTB() {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += rate[i];
        }
        return (double)(sum/5);
    }

    public void viewInfo() {
        System.out.println("Name Product: " + getName());
        System.out.println("Price Product: " + getPrice());
        System.out.println("Description Product: " + getDescription());
        System.out.println("Point evaluation: " + getRateTB());
    }
}
