package iostream_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test_read {

	public static void main(String[] args) throws Exception {
		
		String str = "";
		FileInputStream stream = new FileInputStream("D:/Mystudy/test.txt");
		byte[] buffer = new byte[100];
		int datas = stream.read(buffer);
		str = new String(buffer,0,datas,"UTF-8").trim();
		System.out.println(str);
		stream.close();
		
		FileOutputStream out = new FileOutputStream("data.txt");
		out.write(str.getBytes());
		out.flush();
		out.close();

	}
}
