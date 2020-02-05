package exercise_friend;

import java.util.Scanner;
//�ٸ� Ŭ������ �����ϱ� ���� Ŭ����
public class FriendInfoHandler {

	private Friend[] myFriends; //�������� ���� �� ���� . Friend Ÿ���� ���� �迭
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		
		myFriends = new Friend[num];
		/*Friend Ŭ���� Ÿ�� num�� ���� �� �ִ� ������ �Ҵ��ϰڴ�.
		 *Friend ��ü num���� ��°� �ƴ϶� �� ��ü�� �����ּҸ� ���� �������� num���� ���°Ŵ�.
		 *Friend fr = new Friend("","",""); ��� �� �������� fr�� num�� �����ϴ� ������ �ǹ�
		 *�� �����ּҸ� myFriends���������� ����.
		 */
		numOfFriends = 0;
		
	}
	
	private void addFriendInfo(Friend fren) {
		/*�Ű������� Friend Ÿ���� �������� 
		 * ����ģ�� ���ģ�� ������ ������ �𸣱⶧���� �θ��� Friend ����
		 */
		
		myFriends[numOfFriends++]=fren;
	}
	
	public void addFriend(int choice)//���ģ����,���ģ���� ����
		{ 
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : "); name = sc.nextLine();
		System.out.print("��ȭ : "); phoneNum = sc.nextLine();
		System.out.print("�ּ� : "); addr = sc.nextLine();
		
		if(choice==1) {
			//���ģ�����
			System.out.print("���� :"); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else {
			//���ģ�����
			System.out.print("�а� :"); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
			
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
