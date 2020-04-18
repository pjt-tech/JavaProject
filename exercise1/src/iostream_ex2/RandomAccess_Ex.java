package iostream_ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess_Ex {

	public static void main(String[] args) throws IOException {
		
		//읽고 쓰기를 간단하게 사용할수있다
		RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println(rf.getFilePointer());
		
		//다시 포인터를 0번인덱스로 옮긴다.
		rf.seek(0);
		
		int t =rf.readInt();
		double i = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(t);
		System.out.println(i);
		System.out.println(str);
	
	}
}
