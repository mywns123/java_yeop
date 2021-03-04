package java_chobo.ch11.sub02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercisr11_3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",1,1,100,100,100));
		list.add(new Student("남궁성",1,2,90,70,80));
		list.add(new Student("김자바",1,3,80,80,90));
		list.add(new Student("이자바",1,4,70,90,70));
		list.add(new Student("안자바",1,5,60,100,80));
		
		Collections.sort(list);
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
