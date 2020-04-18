package iostream_ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class OutputStream_ex {

	public static void main(String[] args) {

		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine();
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
