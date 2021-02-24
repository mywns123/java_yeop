package java_chobo.ch02.sub01;

public class Ex2_9 {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f2, f3);
		System.out.printf("f2=%f, %e, %g%n", f1, f2, f3);
		System.out.printf("f3=%f, %e, %g%n", f1, f2, f3);
		System.out.printf("d =%f%n", d);
		System.out.printf("d = %14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[1234567890]%n", d);
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽정렬
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만

		// %f, %e,%g 실수형
		// %f 소수점 아래 6자리까지만 출력
		// %e 지수형태
		// %g 간략하게 표현

	}

}
