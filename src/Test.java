class Test1 {
	
	Test1 getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

public class Test {
	public static void main(String args[]) {
		new Test1().getA().msg();

	}
}
