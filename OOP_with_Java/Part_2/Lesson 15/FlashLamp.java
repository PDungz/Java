import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp() {
        this.status = false;
        this.battery = battery;
    }

    public void setBattery(Battery b) {
        this.battery = b;
    }

    public int getBatteryInfo() {
        return this.battery.getEnergy();
    }

    public void turnOn() {
        if(getBatteryInfo() >= 2) {
            System.out.println("Den sang");
            this.status = true;
            this.battery.decreaseEnergy();
        } else {
            turnOff();
        }
    }

    public void turnOff() {
        this.status = false;
        System.out.println("Den khong sang!");
    }
}
