package Hash;

import java.util.HashSet;

public class Hash_Person_ex {

	public static void main(String[] args) {
		
		HashSet<Person> hashset = new HashSet<>();
		hashset.add(new Person("ȫ�浿",1));
		hashset.add(new Person("ȫ�浿",1));
		
		System.out.println(hashset.size());
		System.out.println(hashset);

	}
}
