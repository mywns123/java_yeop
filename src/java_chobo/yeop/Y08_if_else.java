package java_chobo.yeop;

import java.util.Scanner;

public class Y08_if_else {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <= 93) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <= 83) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78) {
				opt = '+';
			} else if (score <= 73) {
				opt = '-';
			}
		} else {
			grade = 'D';
		}

		System.out.printf("학점은 %c%c입니다.%n", grade, opt);

		sc.close();

	}

}
