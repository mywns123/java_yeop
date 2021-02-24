package java_chobo.yeop;

import java.util.Arrays;
import java.util.Random;

public class Y16_arrary {

	public static void main(String[] args) {
		int[] score = new int[10];

		Random rnd = new Random(12377777);
		for (int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(100) + 1;
		} // end of for
		System.out.println(Arrays.toString(score));

		int[] m = new int[11];
		for (int i = 0; i < score.length; i++) {
			m[score[i] / 10]++;
		} // end of for
		System.out.println(Arrays.toString(m));

		for (int i = 0; i < m.length; i++) {
			System.out.printf("%3d점 :", 10 * i);
			for (int j = 0; j < m[i]; j++) {
				System.out.print("*");
			}// end of for
			System.out.println();
		}// end of for

	}// end of main

}// end of class
