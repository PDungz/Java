import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

class complexNumber {
    private float realPart;
    private float virtualPart;

    public complexNumber() {

    }

    public complexNumber(float realPart, float virtualPart) {
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }

    public void setRealPart(float realPart) {
        this.realPart = realPart;
    }
    
    public float getRealPart() {
        return realPart;
    }

    public void setVirtualPart(float virtualPart) {
        this.virtualPart = virtualPart;
    }

    public float getVirtualPart() {
        return virtualPart;
    }

    public complexNumber addComplexNumber(complexNumber cn) {
        float a = this.realPart + cn.realPart;
        float b = this.virtualPart + cn.virtualPart;
        return new complexNumber(a, b); 
    }

    public complexNumber subComplexNumber(complexNumber cn) {
        float a = this.realPart - cn.realPart;
        float b = this.virtualPart - cn.virtualPart;
        return new complexNumber(a, b);
    }

    public complexNumber mulComplexNumber(complexNumber cn) {
        float a = this.realPart * cn.realPart - this.virtualPart * cn.virtualPart;
        float b = this.realPart * cn.virtualPart + this.virtualPart * cn.realPart;
        return new complexNumber(a, b);
    }

    public complexNumber divComplexNumber(complexNumber cn) {
        float a = (float)((this.realPart * cn.realPart + this.virtualPart * cn.virtualPart)/(cn.realPart*cn.realPart + cn.virtualPart*cn.virtualPart));
        float b = (float)((-this.realPart * cn.virtualPart + this.virtualPart * cn.realPart)/(cn.realPart*cn.realPart + cn.virtualPart*cn.virtualPart));
        return new complexNumber(a, b);
    }

}


public class Lesson8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phuc thu nhat la: ");
        System.out.print("Nhap so thuc: ");
        float a1 = sc.nextFloat();
        System.out.print("Nhap so ao: ");
        float b1 = sc.nextFloat();
        System.out.println("Nhap so phuc thu hai la: ");
        System.out.print("Nhap so thuc: ");
        float a2 = sc.nextFloat();
        System.out.print("Nhap so ao: ");
        float b2 = sc.nextFloat();

        complexNumber sp1 = new complexNumber(a1, b1);
        complexNumber sp2 = new complexNumber(a2, b2);

        // Add complex Number 
        complexNumber A_sp = sp1.addComplexNumber(sp2);
        System.out.println("Tong hai so phuc sp1 va sp2 la: " + A_sp.getRealPart() + " + " + A_sp.getVirtualPart() + "i");   

        // Sub complex Number
        complexNumber S_sp = sp1.subComplexNumber(sp2);
        System.out.println("Hieu hai so phuc sp1 va sp2 la: " + S_sp.getRealPart() + " + " + S_sp.getVirtualPart() + "i");   
        
        // Mul complex Number
        complexNumber M_sp = sp1.mulComplexNumber(sp2);
        System.out.println("Tich hai so phuc sp1 va sp2 la: " + M_sp.getRealPart() + " + " + M_sp.getVirtualPart() + "i");   

        // Div complex Number
        complexNumber D_sp = sp1.divComplexNumber(sp2);
        System.out.println("Thuong hai so phuc sp1 va sp2 la: " + D_sp.getRealPart() + " + " + D_sp.getVirtualPart() + "i");   

    }
}
