
package java_chobo.ch04.sub01;

public class Ex4_8 {

	public static void main(String[] args) {
		sum();
		System.out.println();
		for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
		}

	} // end of main

	public static void sum() {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.printf("sum = %d%n ", sum);
	}

}// end of class
