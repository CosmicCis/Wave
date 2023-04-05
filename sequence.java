public class sequence {
	public static void main(String[] args) {
		printSequence(100);
	}
	public static void printSequence(int count) {
		int a = 00;
		int b = 00;
		int c = 01;
		int d = 01;
		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
			d = b + c;
		}
	}
}