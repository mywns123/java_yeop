package java_chobo.ch04.sub01;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

		sc.close();
	}
}
