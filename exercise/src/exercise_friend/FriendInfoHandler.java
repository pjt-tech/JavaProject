package exercise_friend;

import java.util.Scanner;

public class FriendInfoHandler {

	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		
		myFriends = new Friend[num];
		numOfFriends = 0;
		
	}
	
	private void addFriendInfo(Friend fren) {
		myFriends[numOfFriends++]=fren;
	}
	
	public void addFriend(int choice) {
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("��ȭ : "); phoneNum = sc.nextLine();
		System.out.print("�ּ� : "); addr = sc.nextLine();
		
		if(choice==1) {
			System.out.print("���� :"); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else {
			System.out.print("�а� :"); major = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, major));
			
		}
		
		System.out.println("�Է� �Ϸ� ! \n");
		
	}
	
	public void showAllData() {
		
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println("");
		}
		
	}
	
	public void showAllSimpleData() {
		
		for(int i=0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}

}
