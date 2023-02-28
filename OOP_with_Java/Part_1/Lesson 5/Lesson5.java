import java.util.Scanner;

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setInput(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkTriangle() {
        if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
            if(checkEdgs() == 1) {
                System.out.println("Tam giac co ba canh a, b, c la: Tam giac Vuong can");
            } else {
                System.out.println("Tam giac co ba canh a, b, c la: Tam giac Vuong");
            }
        } else if((a*a + b*b < c*c) || (a*a + c*c < b*b) || (b*b + c*c < a*a)) {
            System.out.println("Tam giac co ba canh a, b, c la: Tam giac Tu");
        } else {
            if(checkEdgs() == 0) {
                System.out.println("Tam giac co ba canh a, b, c la: Tam giac deu");
            } else if(checkEdgs() == 1) {
                System.out.println("Tam giac co ba canh a, b, c la: Tam giac can");
            } else{
                System.out.println("Tam giac co ba canh a, b, c la: Tam giac Nhon");
            }
        }
    }

    public int checkEdgs() {
        if(a == b && a == c) {
            return 0;
        } else if(a == b || b == c || a == c) {
            return 1;
        } else {
            return 2;
        }
    }

    public double Perimeter() {
        return a + b + c;
    }

    public double Area() {
        double p = (double)((a + b + c)/2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}

public class Lesson5 {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           double at = sc.nextDouble();
           double bt = sc.nextDouble();
           double ct = sc.nextDouble();

           Triangle tg = new Triangle(at, bt, ct);
           tg.checkTriangle();
           System.out.println("Perimeter: " + tg.Perimeter());
           System.out.println("Area: " + tg.Area());
    }
}
