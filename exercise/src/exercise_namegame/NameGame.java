package exercise_namegame;

import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {
		
		String name;
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >>>");
		num = s.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >>>");
			name = s.next();
		}
		System.out.print("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
	}
	
}
