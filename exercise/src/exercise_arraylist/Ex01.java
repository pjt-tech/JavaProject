package exercise_arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Phone{
	String name;
	String no;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public Phone() throws IOException {
		System.out.print("이름=");
		name = in.readLine();
		System.out.print("전화번호  =");
		no = in.readLine();
	}
	public void disp() {
		System.out.println(name+":"+no);
	}
}

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
	
		ArrayList<Phone> ar = new ArrayList<Phone>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int s = 0;
		
		while(true) {
			System.out.print("1.입력, 2.조회 , 3.종료 ?");
			s = Integer.parseInt(in.readLine());
			if(s==1)
				ar.add(new Phone());
			if(s==2) {
				for(int i=0; i<ar.size(); ++i) {
					Phone a = ar.get(i);
					a.disp();
				}
			}
			if(s==3)break;
		}
		System.out.println("종료합니다.");
	}
}
