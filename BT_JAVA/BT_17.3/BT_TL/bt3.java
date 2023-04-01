class Test {
	public Test() {
		System.out.println("Ham tao khong doi");
	}

	public Test(int i) {
		this();
	}
}

public class bt3 {
	public static void main(String[] args) {
		Test t = new Test(10);
	}
}