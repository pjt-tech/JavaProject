package file_Exam;

import java.io.File;
import java.io.IOException;

public class file_Ex {

	public static void main(String[] args) throws IOException {
		
		//��θ� mydir�� ���� 
		File mydir = new File("D:/YourJava/JavaDir");
		//mydir��ο� JavaDir���丮 ����
		mydir.mkdir();
		
		//���ϻ���
		File myfile = new File("D:/MyJava/my.bin");
		myfile.createNewFile();
		//�����̵�
		File refile = new File("D:/YourJava/my.bin");
		myfile.renameTo(refile);
		
		//������������Ȯ��
		File myfile1 = new File("D:/MyJava/my.bin");
		if(myfile1.exists()==false) {
		System.out.println("���� ������ �������� �ʽ��ϴ�.");	
		}
		
		//��ξ��� ���� ��ġ�� ���͸� ����
		File curDir = new File("AAA");
		System.out.println(curDir.getAbsolutePath());
		curDir.mkdir();
		System.out.println(curDir.getAbsolutePath());
		
		//���͸��� ���ٸ� ��λ� ���丮 ��� ����
		File upperDir = new File("BBB" + File.separator+"CCC");
		upperDir.mkdirs();
				

	}
}
