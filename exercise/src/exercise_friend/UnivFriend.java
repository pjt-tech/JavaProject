package exercise_friend;

public class UnivFriend extends Friend {
	
	String major;
	
	public UnivFriend (String name,String phone,String addr , String major) {
		super(name,phone,addr); //부모객체의 생성자를 호출함
		this.major = major;
	}
	
	public void showData() {  //오버라이딩
		super.showData();
		System.out.println("전공 : " + major);
	}
	
	public void showBasicInfo() {  //오버라이딩
		System.out.println("이름 :" + name); 
		System.out.println("전화 :" + phoneNum);
		System.out.println("전공 :" + major);
		
		//자식에게는   name,phoneNum없음 상속받았기때문에 사용가능
	}

}
