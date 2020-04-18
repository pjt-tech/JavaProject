package iostream_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:/Mystudy/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[5];
		readByteNo = is.read(readBytes,0,3);
		for(int i =0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
