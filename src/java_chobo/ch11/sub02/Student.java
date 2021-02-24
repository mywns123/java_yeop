package java_chobo.ch11.sub02;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTaotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTaotal()/3f)*10+0.5)/10f;
	}
	@Override
	public String toString() {
		return String.format(
				"%s, %s, %s, %s, %s, %s, %s, %s", name, ban,
				no, kor, eng, math, getTaotal(), getAverage());
	}
	
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
}
