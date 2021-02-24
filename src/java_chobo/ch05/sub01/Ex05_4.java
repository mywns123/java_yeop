package java_chobo.ch05.sub01;

import java.util.Arrays;
import java.util.Random;

public class Ex05_4 {

	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		Random rnd = new Random();
		int i = rnd.nextInt(10) + 1;
		int temp = numArr[0];
		numArr[0] = numArr[i];
		numArr[i] = temp;
		System.out.println(Arrays.toString(numArr));
	}

}
