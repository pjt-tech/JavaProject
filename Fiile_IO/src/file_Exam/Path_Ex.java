package file_Exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_Ex {

	public static void main(String[] args) throws IOException{
		String path;
		Path pt1 = Paths.get("");
		if(pt1.isAbsolute()) {
			System.out.println("절대경로");
		}else {
			path = pt1.toAbsolutePath().toString(); 
			System.out.println(path);
		}
		
		Path fp = Paths.get("D:/JavaStudy/simple.bin");
		Path fp1 = Paths.get("D:/JavaStudy");
		
		fp1 = Files.createDirectories(fp1);
		fp = Files.createFile(fp);
		
		
	}

}
