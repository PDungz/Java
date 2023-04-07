import java.util.Scanner;

public class Person {
    private String name;
    private String birthday;
    private String CCCD;

    public Person() {

    }

    public Person(String name, String birthday, String CCCD) {
        this.name = name;
        this.birthday = birthday;
        this.CCCD = CCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBithrday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Birday: ");
        this.birthday = sc.nextLine();
        System.out.print("CCCD: ");
        this.CCCD = sc.nextLine();
    }

    public void outPut() {
        System.out.println();
        System.out.println();
        System.out.println("Name: " + this.name);
        System.out.println("Birthday: " + this.birthday);
        System.out.println("CCCD: " + this.CCCD);
    }
}
