import java.util.Scanner;

public class TestFlashLamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khai bao va khoi tao doi tuong Battery
        Battery bry = new Battery();
        // Khai bao va khoi tao doi tuong FlashLamp
        FlashLamp Flp = new FlashLamp();

        // Thuc hien sac lai pin
        System.out.print("Muc pin can sac: ");
        int pin = sc.nextInt();
        bry.setEnergy(pin);
        System.out.println("Muc nang luong cua pin: " + bry.getEnergy());
        
        // Lap pin cho FlashLamp
        Flp.setBattery(bry);

        // Bat den va tat den
        for(int i = 0; i < 10; i++) {
            Flp.turnOn();
            Flp.turnOff();
        }

        // In ra muc nang luong con lai cua pin cua den
        System.out.println("Muc nang luong cua pin cua den: " + Flp.getBatteryInfo());


    }
}
