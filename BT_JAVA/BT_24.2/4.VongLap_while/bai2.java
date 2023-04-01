public class bai2 { // bai vd 1 va 2 cho vong lap while va do while
    public static void main(String[] args) {
        int a = 5;
        int gt = 1;
        while(a > 1) {
            gt = gt*a;
            --a;
        }
        System.out.print("Gia thua cua 5 la: " + gt);
    }
}