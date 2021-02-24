package java_chobo.ch04.sub02;

public class Ex4_10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
			System.out.printf("1부터 %d까지의 합 = %d%n", i, sum);
		}
		System.out.println(sum);
	}

}
