package iostream_ex;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataBuffered_Ex {

	public static void main(String[] args) throws Exception {
		OutputStream out1 = new FileOutputStream("D:/JavaProjects/data1.bin");
		DataOutputStream dataOut = new DataOutputStream(out1);
		Data_Performance.performanse(dataOut);
		dataOut.close();
		
		OutputStream out2 = new FileOutputStream("D:/JavaProjects/data2.bin");
		DataOutputStream dataOut2 = new DataOutputStream(out2);
		BufferedOutputStream buf1 = new BufferedOutputStream(dataOut2);
		Data_Performance.performanse(dataOut2);
		dataOut2.close();

	}

}
