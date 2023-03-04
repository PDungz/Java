import java.util.Scanner;

// Da giac 4 canh
class Polygon {
    private float a;
    private float b;
    private float c;
    private float d;

    public Polygon() {

    }

    public Polygon(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void setEgdes(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
    
    public float getC() {
        return c;
    }

    public float getD() {
        return d;
    }

    public float Perimeter() {
        return (a + b + c + d);
    }

}

// Hinh binh hanh
class Parallelogram extends Polygon {
    private float h;

    public Parallelogram() {
        super();
    }

    public Parallelogram(float a, float b, float c, float d) {
        super(a, b, c, d);
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getH() {
        return h;
    }
    // Tinh dien tich hbh voi h la chieu cao cua HBH va a la canh cua HBH vuong goc voi h
    public float Area() {
        return getA() * h;
    }

}

// Hinh chu nhat
class Rectangle extends Parallelogram {
    public Rectangle() {
        super();
    }
    
    public Rectangle(float a, float b, float c, float d) {
        super(a, b, c, d);
    }

    @Override
    public float Area() {
        return getA() * getB();
    }

}

// Hinh vuong
class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(float a, float b, float c, float d) {
        super(a, b, c, d);
    }

    @Override
    public float Area() {
        return getA() * getA();
    }

}


public class Lesson12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // Nhap cac canh va chieu cao cua HBH
        // Pm viết tắt của Parallelogram
        System.out.print("Nhap a la: ");
        float a_Pm = sc.nextFloat(); 
        System.out.print("Nhap b la: ");
        float b_Pm = sc.nextFloat();
        // Tinh dien tich va chu vi cua HBH
        Parallelogram Pm = new Parallelogram(a_Pm, b_Pm, a_Pm, b_Pm);
        System.out.println("Perimeter parallelogram: " + Pm.Perimeter());
        System.out.print("Nhap hight la: ");
        float h_Pm = sc.nextFloat();
        Pm.setH(h_Pm);
        System.out.println("Area parallelogram: " + Pm.Area());


        // Nhap cac cua HCN
        // Rel viết tắt của Rectangle
        System.out.print("Nhap a la: ");
        float a_Rel = sc.nextFloat();
        System.out.print("Nhap a la: ");
        float b_Rel = sc.nextFloat();
        Rectangle Rel = new Rectangle(a_Rel, b_Rel, a_Rel, b_Rel);
        System.out.println("Perimeter Rectangle: " + Rel.Perimeter());
        System.out.println("Area Rectangle: " + Rel.Area());


        // Nhap cac canh cua HVG
        // SpE viết tắt của Square
        System.out.print("Nhap a la: ");
        float a_SpE = sc.nextFloat();
        Square SpE = new Square(a_SpE, a_SpE, a_SpE, a_SpE);
        System.out.println("Perimeter Square: " + SpE.Perimeter());
        System.out.println("Area Square: " + SpE.Area());

        // Test Ham nhap cac canh
        System.out.print("Nhap a la: ");
        float a1_SpE = sc.nextFloat();
        Square SpE1 = new Square();
        SpE1.setEgdes(a1_SpE, a1_SpE, a1_SpE, a1_SpE);
        System.out.println("Perimeter Square: " + SpE1.Perimeter());
        System.out.println("Area Square: " + SpE1.Area());

    }
}
