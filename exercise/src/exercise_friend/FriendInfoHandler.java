package exercise_friend;

import java.util.Scanner;
//다른 클래스를 관리하기 위한 클래스
public class FriendInfoHandler {

	private Friend[] myFriends; //참조변수 선언 만 해줌 . Friend 타입을 갖는 배열
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		
		myFriends = new Friend[num];
		/*Friend 클래스 타입 num개 담을 수 있는 공간을 할당하겠다.
		 *Friend 객체 num개를 담는게 아니라 각 객체의 시작주소를 갖는 참조변수 num개를 갖는거다.
		 *Friend fr = new Friend("","",""); 라면 이 참조변수 fr을 num개 저장하는 공간을 의미
		 *그 시작주소를 myFriends참조변수에 저장.
		 */
		numOfFriends = 0;
		
	}
	
	private void addFriendInfo(Friend fren) {
		/*매개변수는 Friend 타입의 참조변수 
		 * 대학친구 고등친구 누구를 받을지 모르기때문에 부모인 Friend 참조
		 */
		
		myFriends[numOfFriends++]=fren;
	}
	
	public void addFriend(int choice)//고딩친구냐,대딩친구냐 결정
		{ 
		String name, phoneNum, addr, job, major;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : "); name = sc.nextLine();
		System.out.print("전화 : "); phoneNum = sc.nextLine();
		System.out.print("주소 : "); addr = sc.nextLine();
		
		if(choice==1) {
			//고딩친구라면
			System.out.print("직업 :"); job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else {
			//대딩친구라면
			System.out.print("학과 :"); major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
			
		}
		
		System.out.println("입력 완료 ! \n");
		
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
