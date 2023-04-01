public class bt2 {
    public static int add(int a, int b) {
        return (a + b);
    }

    public int sub(int a, int b) {
        return (a - b);
    }

    public static void main(String[] args) {
        bt2 cal = new bt2();
        int s = cal.sub(3, 5);
        System.out.println("Subtraction result: " + s);

        // calling static method
        int a = bt2.add(3, 5);
        System.out.println("Addition result: " + a);
    }
}
