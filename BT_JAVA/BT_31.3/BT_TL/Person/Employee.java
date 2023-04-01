public class Employee extends Person {
    private float salary;

    // Phuong thuc khoi tao
    public Employee() {

    }

    public Employee(String name, int age, String address, float salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Salary: " + salary);
    }
}
