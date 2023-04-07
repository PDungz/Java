import java.util.Scanner;

public class Customer extends Person{
    private float DateTime;
    private String Room;
    private float Price;
    
    public Customer() {
        super();
    }

    public Customer(String name, String birthday, String CCCD, float DateTime, String Room, float Price) {
        super(name, birthday, CCCD);
        this.DateTime = DateTime;
        this.Room = Room;
        this.Price = Price;
    }

    public float getDateTime() {
        return DateTime;
    }

    public void setDateTime(float DateTime) {
        this.DateTime = DateTime;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in); 
        System.out.print("DateTime: ");
        this.DateTime = sc.nextFloat();
        sc.nextLine();
        System.out.print("Room: ");
        this.Room = sc.nextLine();
        System.out.print("Price: ");
        this.Price = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("DateTime: " + this.DateTime);
        System.out.println("Room: " + this.Room);
        System.out.println("Price: " + this.Price);
        System.out.println("Bill: " + billPrice());
    }

    public float billPrice() {
        return this.DateTime * this.Price;
    }
}
