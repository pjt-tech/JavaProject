package objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeWriter {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:/JavaProjects/object.txt"));
		ClassA a = new ClassA();
		a.field1=1;
		a.field2.field5=2;
		a.field3=3;
		a.field4=4;
		os.writeUTF("¾È³ç");
		os.writeObject(a);
		os.flush();
		os.close();
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:/JavaProjects/object.txt"));
		System.out.println(is.readUTF());
		ClassA instance = (ClassA)is.readObject();
		System.out.println("filed1 : " + instance.field1);
		System.out.println("filed2 : " + instance.field2.field5);
		System.out.println("filed3 : " + instance.field3);
		System.out.println("filed4 : " + instance.field4);
	}
}
