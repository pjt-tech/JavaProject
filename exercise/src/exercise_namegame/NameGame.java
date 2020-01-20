package exercise_namegame;

import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {
		
		String name;
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까 >>>");
		num = s.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>>");
			name = s.next();
		}
		System.out.print("시작하는 단어는 아버지입니다.");
	}
	
}
