package file_Exam;

import java.io.File;
import java.io.IOException;

public class file_Ex {

	public static void main(String[] args) throws IOException {
		
		//경로를 mydir에 설정 
		File mydir = new File("D:/YourJava/JavaDir");
		//mydir경로에 JavaDir디렉토리 생성
		mydir.mkdir();
		
		//파일생성
		File myfile = new File("D:/MyJava/my.bin");
		myfile.createNewFile();
		//파일이동
		File refile = new File("D:/YourJava/my.bin");
		myfile.renameTo(refile);
		
		//파일존재유무확인
		File myfile1 = new File("D:/MyJava/my.bin");
		if(myfile1.exists()==false) {
		System.out.println("원본 파일이 존재하지 않습니다.");	
		}
		
		//경로없이 현재 위치에 디렉터리 생성
		File curDir = new File("AAA");
		System.out.println(curDir.getAbsolutePath());
		curDir.mkdir();
		System.out.println(curDir.getAbsolutePath());
		
		//디렉터리가 없다면 경로상 디렉토리 모두 생성
		File upperDir = new File("BBB" + File.separator+"CCC");
		upperDir.mkdirs();
				

	}
}
