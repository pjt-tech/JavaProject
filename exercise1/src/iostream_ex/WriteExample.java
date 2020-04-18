package iostream_ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:/Mystudy/text.txt");
	    
		byte[] data = "¾È³ç".getBytes();
		for(int i = 0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
