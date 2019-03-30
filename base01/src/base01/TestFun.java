package base01;

public class TestFun {
	public static void main(String[] args) {
		System.out.println(fun(5));
	}

	private static int fun(int i) {
		if(i<1) {
			return 1;
		}
//		System.out.println(i);
		return i*fun(i-1);
	}
}
