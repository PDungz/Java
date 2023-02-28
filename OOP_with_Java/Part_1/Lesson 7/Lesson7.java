import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

class Fraction {
    // Attribute
    private float numerator;
    private float denominator;
    // Contractor
    public Fraction() {

    }

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(float numerator) {
        this.numerator = numerator;
    }

    public float getNumerator() {
        return numerator;
    }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }

    public float getDenominator() {
        return denominator;
    }

    // Reduce numerator and denominator
    public void reduceFraction() {
        float a = numerator/USCLN(numerator, denominator);
        float b = denominator/USCLN(numerator, denominator);
        this.numerator = a;
        this.denominator = b;
    }

    // interchangable Fraction
    public void fractionInverse() {
        float found = numerator;
        this.numerator = denominator;
        this.denominator = found;
    }

    // Add, Sub, Mul, Div 
    public void addFraction(float a, float b, float c, float d) {
        this.numerator = a*d + c*b;
        this.denominator = b*d;
    }

    public void subFraction(float a, float b, float c, float d) {
        this.numerator = a*d - c*b;
        this.denominator = b*d;
    }

    public void divFraction(float a, float b, float c, float d) {
        this.numerator = a*c;
        this.denominator = b*d;
    }

    public void mulFraction(float a, float b, float c, float d) {
        this.numerator = a*d;
        this.denominator = b*c;
    }

    // display fraction
    public void display() {
        System.out.println("Fraction: " +numerator + "/" + denominator);
    }

    // USCLN and BSCNN
    public float USCLN(float numerator, float denominator) {
        if(denominator == 0) {
            return numerator;
        } 
        return USCLN(denominator, numerator % denominator);
    }

    public float BSCNN(float numerator, float denominator) {
        return (numerator * denominator) / USCLN(numerator, denominator);
    }
}

public class Lesson7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap numerator: ");
        float a = sc.nextFloat();
        System.out.print("Nhap denominator: ");
        float b = sc.nextFloat();
        Fraction ps = new Fraction(a, b);
        // Test reduce Fraction
        ps.reduceFraction();
        ps.display();
        // Test Fraction inverse
        ps.fractionInverse();
        ps.display();
        // Nhap hai phan so de thuc hien cac phep tinh
        System.out.print("Nhap numerator: ");
        float a1 = sc.nextFloat();
        System.out.print("Nhap denominator: ");
        float b1 = sc.nextFloat();System.out.print("Nhap numerator: ");
        float a2 = sc.nextFloat();
        System.out.print("Nhap denominator: ");
        float b2 = sc.nextFloat();
        Fraction psn = new Fraction();
        // Test Fraction Add
        System.out.println("Add Fraction: ");
        psn.addFraction(a1, b1, a2, b2); 
        psn.display();
        // Sau khi rut gon
        System.out.println("Sau khi rut gon kq: ");
        psn.reduceFraction();
        psn.display();
        // Test Fraction Sub
        System.out.println("Sub Fraction: ");
        psn.subFraction(a1, b1, a2, b2); 
        psn.display();
        // Sau khi rut gon
        System.out.println("Sau khi rut gon kq: ");
        psn.reduceFraction();
        psn.display();
        // Test Fraction Div
        System.out.println("Div Fraction: ");
        psn.divFraction(a1, b1, a2, b2); 
        psn.display();
        // Sau khi rut gon
        System.out.println("Sau khi rut gon kq: ");
        psn.reduceFraction();
        psn.display();
        // Test Fraction Mul
        System.out.println("Mul Fraction: ");
        psn.mulFraction(a1, b1, a2, b2); 
        psn.display();
        // Sau khi rut gon
        System.out.println("Sau khi rut gon kq: ");
        psn.reduceFraction();
        psn.display();        
    }
}