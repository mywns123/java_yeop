package java_chobo.ch04.sub02;

public class Ex4_end {

	public static void main(String[] args) {

		test01();
		test02();
		test03();

	}

	private static void test03() {
		int sum = 0;
		for (int i = 1;; i++) {
			if (i % 2 == 0) {
				i = -i;
			}
			sum += i;
			if (sum > 100) {
				System.out.printf("%d", i);

			}
		}

	}

	private static void test02() {
		int sum = 0;
		for (int j = 1; j < 11; j++) {
			int sum01 = 0;
			for (int i = 1; i <= j; i++) {
				sum01 = sum01 + i;
			}
			sum = sum + sum01;
		}
		System.out.printf("%d", sum);
	}

	private static void test01() {
		int sum = 0;
		for (int i = 1; i < 21; i++)
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				sum = sum + i;
			}
		System.out.printf("%d", sum);
	}
}
