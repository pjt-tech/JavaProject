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
			   //for���� �̿��Ͽ� �迭�ȿ� ���� �Է� �� ���
			  
		}
		
		//��ü 5�� ������ �迭�� �����ϰڴ�.
		 Person[] pa = new Person[5];
		 pa[0] = new Person("\nȫ�浿",22);
		 pa[1] = new Person("��ö��",32);
		 pa[2] = new Person("�̿���",28);
		 pa[3] = new Person("������",55);
		 pa[4] = new Person("������",23);
		 
		 for(int i=0; i<pa.length; ++i) {
			 pa[i].disp();
		 }
	}

}
