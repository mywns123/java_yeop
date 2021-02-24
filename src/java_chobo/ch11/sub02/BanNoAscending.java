package java_chobo.ch11.sub02;

import java.util.Comparator;

public class BanNoAscending implements Comparator<Student> {

	@Override
	public int compare(java_chobo.ch11.sub02.Student o1, java_chobo.ch11.sub02.Student o2) {
		if (o1.ban != o2.ban) {
			return o1.ban - o2.ban;
		} else {
			return o1.no - o2.no;
		}

	}

}
