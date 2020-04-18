package iostream_ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream_ex {

	public static void main(String[] args) {

		/*
		try {
			FileInputStream fis = new FileInputStream("D:/Mystudy/text3.txt");
			FileOutputStream fos = new FileOutputStream("data1.txt");
			int i = 0;
			while((i = fis.read())!=-1) {
			System.out.print((char)i);
			fos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		try {
			FileInputStream fis = new FileInputStream("D:/Mystudy/test.txt");
			FileOutputStream fos = new FileOutputStream("data2.txt");
			byte[] buf = new byte[500];
			int i = fis.read(buf);			
			String str = new String(buf,"UTF-8");			
			System.out.println(str);
			buf = str.getBytes();			
			fos.write(buf);			
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
