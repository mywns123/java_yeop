package java_chobo.yeop;

public class Y07_equals {

	public static void main(String[] args) {
		String str01 = "abc";
		String str02 = new String("abc");
		String str03 = "abc";

		if (str01 == str02) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str02 == str03) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str01 == str03) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str01.equals(str02)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str02.equals(str03)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str01.equals(str03)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
