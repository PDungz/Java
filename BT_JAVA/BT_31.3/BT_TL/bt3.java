public class bt3 {
    public float dienTich(float a) {
        return (float) a * a;
    }

    public float dienTich(float a, float b) {
        return (float) a * b;
    }

    public float dienTich(float a, float b, float c) {
        float p = (float)(a + b + c) / 2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        bt3 hv = new bt3();
        bt3 hcn = new bt3();
        bt3 htg = new bt3();

        System.out.println("Dien tich hinh vung la: " + hv.dienTich(5));
        System.out.println("Dien tich hinh chu nhat la: " + hcn.dienTich(3, 6));
        System.out.println("Dien tich hinh tam giac la: " + htg.dienTich(1, 2, 3));
    }
}
