package java_chobo.yeop;

public class Y03_swap_main {
	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		System.out.printf("x = %d, y =%d%n", i, j);
		swap01(i, j);
		System.out.printf("x = %d, y =%d%n", i, j);

		Y03_swap_sub cal = new Y03_swap_sub();

		cal.k = 5;
		cal.l = 10;
		System.out.printf("swap : x = %d, y =%d%n", cal.k, cal.l);
		swap02(cal);
		System.out.printf("swap : x = %d, y =%d%n", cal.k, cal.l);

	}

	private static void swap02(Y03_swap_sub cal) {
		System.out.printf("swap : x = %d, y =%d%n", cal.k, cal.l);
		int temp = cal.k;
		cal.k = cal.l;
		cal.l = temp;
		System.out.printf("swap : x = %d, y =%d%n", cal.k, cal.l);

	}

	private static void swap01(int i, int j) {
		System.out.printf("swap : x = %d, y =%d%n", i, j);
		int temp = i;
		i = j;
		j = temp;
		System.out.printf("swap : x = %d, y =%d%n", i, j);
	}
}
