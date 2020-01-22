package exercise_friend;

public class Friend {

	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	
	public void showData() {
		
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo() {
	/*
	 *  아무것도 정의하지 않고 함수만 정의함.
	 *  다형성의 성질을 이용하기 위해서(오버라이딩)
	 *  자식객체와 똑같은 함수를 일부러 껍데기만 정의해놓음
	 *  오버라이딩을 이용하여 대학,고등 을 구분하기 위함	
	 */
	
	}
}
