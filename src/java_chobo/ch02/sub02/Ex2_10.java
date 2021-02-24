package java_chobo.ch02.sub02;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두자리 정수를 입력해주세요.");
		String str = sc.nextLine();
		int num = Integer.parseInt(str); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :" + str);
		System.out.printf("num=%d%n", num);
		
		sc.close();

	}

}
