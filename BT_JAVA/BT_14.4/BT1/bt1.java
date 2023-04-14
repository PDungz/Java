class Person {
    private String name;
    private String birthday;

    public Person() {

    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

class Employee extends Person {
    private int salary;
    
    public Employee() {

    }

    public Employee(String name, String birthday, int salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    } 
}

class Manager extends Employee {
    Employee assistant = new Employee();

    public void setAssistant(Employee e) {
        assistant = e;
    }
}


public class bt1 { 
    
    public static String teamInfor(Person p1, Person p2) {
        return "leader: " + p1.getName() + ", member: " + p2.getName();
    }
    public static void main(String[] args) {
        // Manager junior = new Manager();
        // Manager senior = new Manager();
        // senior.setAssistant(junior);

        Employee e1 = new Employee("haloi", "30/4", 10000);
        Employee e2 = new Employee("Nghaloi", "1/5", 10000);

        Manager m1 = new Manager();
        // m1.setAssistant(e2);
        m1.setName("Hllo");
        Manager m2 = new Manager();
        // m2.setAssistant(e1);
        m2.setName("HlloMa");


        System.out.println(teamInfor(e1, e2));
        System.out.println(teamInfor(m1, m2));
        System.out.println(teamInfor(m1, e2));

    }
}