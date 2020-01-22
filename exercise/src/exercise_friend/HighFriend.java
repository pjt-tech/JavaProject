package exercise_friend;

public class HighFriend extends Friend {
	
	String work;
	
	public HighFriend(String name, String phone , String addr, String job) {
		
		super(name,phone,addr); //부모객체의 생성자 호출 
		work = job;
	}
	
	public void showData() { //부모객체에도 같은 이름 있음 . 오버라이딩 됨
		
		super.showData();
		System.out.println("직업 :" + work);
	}
	
	public void showBasicInfo() {    //부모객체에도 같은 이름 있음 . 오버라이딩 됨
		System.out.println("이름 : " + name); //자식에는 name이 없음 상속관계이기 때문에 부모객체에 name사용 가능.
		System.out.println("전화 : " + phoneNum); 
	}

}
