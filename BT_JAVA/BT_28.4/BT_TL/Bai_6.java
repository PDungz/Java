import java.io.InputStreamReader;
import java.io.IOException;

public class Bai_6 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);

        try {
            System.out.print("Nhap vao 1 ky tu: ");
            char c = (char) isr.read();
            System.out.println("Ky tu vua nhap: " + c);
        } catch (IOException ioe) {
            // TODO: handle exception
            ioe.printStackTrace();
        }
    }
}
