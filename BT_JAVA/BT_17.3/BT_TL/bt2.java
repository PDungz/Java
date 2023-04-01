import java.util.Scanner;

class Rectangle {
    public  float length;
    public  float width;

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

public class bt2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10f, 9f);
        Rectangle r2 = new Rectangle(15f, 7f);

        System.out.println("R1 length = " + r1.length);
        System.out.println("R1 width = " + r1.width);
        
        System.out.println("R1 length = " + r2.length);
        System.out.println("R1 width = " + r2.width);

        r1.length = 19f;
        r1.width = 10f;

        System.out.println("R1 length = " + r1.length);
        System.out.println("R1 width = " + r1.width);

        System.out.println("R1 length = " + r2.length);
        System.out.println("R1 width = " + r2.width);

        System.out.println("R1 Area = " + r1.getArea());
        System.out.println("R2 Area = " + r1.getArea());

    }
}