import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;
class Employee {
    private String name;
    private int age;
    private String address;
    private long salary;
    private long totalHours;

    public Employee() { 
    
    }

    public Employee(String name, int age, String address, long salary, long totalHours ) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.totalHours = totalHours;
    }

    public void setInformation(String name, int age, String address, long salary, long totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.totalHours = totalHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setTotalHours(long totalHours) {
        this.totalHours = totalHours;
    }

    public long getTotalHours() {
        return totalHours;
    }

    public long getBonus() {
        if(totalHours >= 200) {
            return salary*2;
        } else if(totalHours < 100) {
            return 0;
        } else {
            return salary*10/100;
        }
    }

    public void Display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
        System.out.println("Total hours: " + getTotalHours());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Total salary: " + (getSalary() + getBonus()));
    }
}

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String Name = sc.next();
            System.out.print("Age: ");
            int Age = sc.nextInt();
            System.out.print("Address: ");
            String Address = sc.next();
            System.out.print("Salary: ");
            long Salary = sc.nextLong();
            System.out.print("Total hours: ");
            long TotalHours = sc.nextLong();
            System.out.println();
            employees[i] = new Employee(Name, Age, Address, Salary, TotalHours);
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println("Employee " + i);
            employees[i].Display();
            System.out.println();
        }
    }
}
