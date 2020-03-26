import java.util.*;

public class HsahSet_Example {
	public static void main(String[] args) {
		/*
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student(1,"È«±æµ¿"));
		set.add(new Student(1,"È«±æµ¿"));
		*/
		
		HashMap<Student,Integer> map = new HashMap<Student,Integer>();
		map.put(new Student(1,"AOA"), 95);
		map.put(new Student(1,"AOA"), 95);
		
		
		
		System.out.println("ÃÑ Entry ¼ö : "+map.size());
	}

}
