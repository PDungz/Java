public class Person {
    private String name;
    private int age;
    private String address;

    // Khoi tao
    public Person() {

    } 

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void show() {
        System.out.println("Ho ten: " + name + "\nTuoi: " + age + "\nDia chi: " + address);
    }
}
