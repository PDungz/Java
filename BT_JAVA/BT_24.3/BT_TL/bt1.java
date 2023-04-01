public class bt1 {
    int x, y, z;
    public bt1() {
        x = y = z = 0;
        this.outData();
    }

    public bt1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.outData();
    }

    public void outData() {
        System.out.println("" + x + " ," + y + " ," + z);
    }

    public static void main(String[] args) {
        System.out.println("Ham khoi tao khong tham so!");
        bt1 b1 = new bt1();
        System.out.println("Ham khoi tao co tham so!");
        bt1 b2 = new bt1(5, 6, 7);
    }
}
