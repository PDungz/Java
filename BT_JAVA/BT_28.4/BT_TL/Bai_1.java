public class Bai_1 {
    public static void main(String[] args) {
        int  []a = {1, 2, 4, 7, 10};
        try {
            System.out.println("a[6] = " + a[6]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // TODO: handle exception
            System.out.println("Loi! Vuot qua chi mua cua mang" + ex);
        }
    }
}