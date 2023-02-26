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
            System.out.println("Tam giac co ba canh a, b, c la: Tam giac Vuong");
        } else if((a*a + b*b < c*c) || (a*a + c*c < b*b) || (b*b + c*c < a*a)) {
            System.out.println("Tam giac co ba canh a, b, c la: Tam giac Tu");
        } else {
            System.out.println("Tam giac co ba canh a, b, c la: Tam giac Nhon");
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
