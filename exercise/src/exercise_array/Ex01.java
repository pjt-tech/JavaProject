package exercise_array;

public class Ex01 {

	public static void main(String[] args) {
		int[] kor = {1,2,3,4,5};
		//�ν��Ͻ�ȭ�� ���ÿ� �ε����� ���� �־���
		
		char[] ko = new char[5];
		//�ν��Ͻ�ȭ �Ҷ� �ε����� ũ�⼳��
		
		
		
		for(int i = 0; i<kor.length; i++) {
		    System.out.println(kor[i]);
		    //for���� �̿��Ͽ� �迭�� ���� ���
		}
		char c = 'A';
		
		for(int i = 0; i<ko.length; ++i) {
			   ko[i] = c++;
			   System.out.print(ko[i]);
		}
	}

}
