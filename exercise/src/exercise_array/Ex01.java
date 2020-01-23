package exercise_array;

public class Ex01 {

	public static void main(String[] args) {
		int[] kor = {1,2,3,4,5};
		//인스턴스화와 동시에 인덱스에 값을 넣어줌
		
		char[] ko = new char[5];
		//인스턴스화 할때 인덱스의 크기설정
		
		
		
		for(int i = 0; i<kor.length; i++) {
		    System.out.println(kor[i]);
		    //for문을 이용하여 배열의 값을 출력
		}
		char c = 'A';
		
		for(int i = 0; i<ko.length; ++i) {
			   ko[i] = c++;
			   System.out.print(ko[i]);
		}
	}

}
