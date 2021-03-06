package java_chobo.ch11.sub02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercisr11_4 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
		
		Collections.sort(list,new BanNoAscending());
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}	

}
