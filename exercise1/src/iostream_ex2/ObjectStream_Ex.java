package iostream_ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream_Ex {

	public static void main(String[] args) {
	
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("D:/Mystudy/obj.txt"));
			ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("D:/Mystudy/obj.txt"));
			Person p = new Person("±è¿¹Àº",27);
			System.out.println(p);
			obj.writeObject(p);
			obj.flush();
			obj.close();
			
			Person p1 = (Person)obj1.readObject();
			System.out.println(p1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
