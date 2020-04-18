package iostream_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:/Mystudy/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while((readByteNo = is.read(readBytes))!=-1) {
			data += new String(readBytes,0,readByteNo,"UTF-8");
			
		}
		System.out.println(data);
		is.close();
	}
}
