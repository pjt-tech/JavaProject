package iostream_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:/Mystudy/text2.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		OutputStream os1 = new FileOutputStream("D:/Mystudy/text3.txt");
		byte[] data1 = "ABC".getBytes();
		os1.write(data1, 0, 2);
		os1.flush();
		os1.close();
		
	
	}
}
