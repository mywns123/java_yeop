package java_chobo.ch06.sub02;

public class Ex6_10_main {

	public static void main(String[] args) {
		Ex6_10_MyMath3 mm = new Ex6_10_MyMath3();
		System.out.println("mm.add(3,3)결과 : " + mm.add(3,3));
		System.out.println("mm.add(3L,3)결과 : " + mm.add(3L,3));
		System.out.println("mm.add(3,3L)결과 : " + mm.add(3,3L));
		System.out.println("mm.add(3L,3L)결과 : " + mm.add(3L,3L));
		
		int[] a = {100, 200,300};
		System.out.println("mm.add결과 : " + mm.add(a));
	} //end of main
	
	

}
