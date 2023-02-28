import java.util.Scanner;

class Rectangle {
    private float length;
    private float width;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getArea() {
        return length*width;
    }

    public float getPerimeter() {
        return 2*length*width;
    }

    public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

public class Lesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle hcn = new Rectangle(10, 9);
        hcn.display();
        System.out.print("Nhap length: ");
        float a = sc.nextFloat();
        System.out.print("Nhap width: " );
        float b = sc.nextFloat();
        Rectangle hcN = new Rectangle();
        hcN.setLength(a);
        hcN.setWidth(b);
        hcN.display();
    }
}
