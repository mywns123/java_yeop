package java_chobo.ch05.sub01;

import java.util.Arrays;

public class Ex05_3 {

	public static void main(String[] args) {
		int[] numArr = { 79, 88, 91, 33, 100, 55, 95 };
		System.out.println(Arrays.toString(numArr));
		int max = numArr[0];
		int min = numArr[0];

		for (int i = 1; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			} else if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println("max =" + max + " min =  " + min);

	}

}
