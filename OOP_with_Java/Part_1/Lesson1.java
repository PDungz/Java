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

    public long getSalary() {
        if(totalHours >= 200) {
            return salary + salary*2;
        } else if(totalHours < 100) {
            return salary;
        } else {
            return salary + salary*10/100;
        }
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + getSalary());
        System.out.println("Total hours: " + totalHours);
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
