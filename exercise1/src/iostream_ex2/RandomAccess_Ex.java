package iostream_ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess_Ex {

	public static void main(String[] args) throws IOException {
		
		//�а� ���⸦ �����ϰ� ����Ҽ��ִ�
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");
		System.out.println(rf.getFilePointer());
		
		//�ٽ� �����͸� 0���ε����� �ű��.
		rf.seek(0);
		
		int t =rf.readInt();
		double i = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(t);
		System.out.println(i);
		System.out.println(str);
	
	}
}
