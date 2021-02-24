package java_chobo.yeop;

import java.util.Scanner;

public class Y04_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		num(sc);

		num1(sc);

		add(sc);

		sub(sc);
		sc.close();
	}

	public static void sub(Scanner sc) {
		System.out.print("두 정수를 입력하세요");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("num = " + (num2 - num3));
	}

	public static void add(Scanner sc) {
		System.out.print("두 정수를 입력하세요");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("num = " + (num2 + num3));
	}

	public static void num1(Scanner sc) {
		System.out.print("문자를 입력하세요.");
		String str = sc.next();
		int num1 = Integer.parseInt(str);
		System.out.println("str = " + num1);
	}

	public static void num(Scanner sc) {
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		System.out.println("num = " + num);
	}

}
