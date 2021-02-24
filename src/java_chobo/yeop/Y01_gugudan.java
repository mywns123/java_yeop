package java_chobo.yeop;

public class Y01_gugudan {

	public static void main(String[] args) {

		gugudan(2);
	}

	private static void gugudan(int a) {
		for (int i = a; i < 10; i++) {
			System.out.println();
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}

	}
}
