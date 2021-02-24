package java_chobo.yeop;

public class Y02_sum {

	public static void main(String[] args) {
		sum(3, 1, 10);

	}

	private static void sum(int i, int j, int k) {
		int sum = 0;
		for (int a = j; a < k + 1; a++) {
			if (a % i == 0) {
				sum = sum + a;
			}
		}
		System.out.printf("%d%n", sum);
	}

}
