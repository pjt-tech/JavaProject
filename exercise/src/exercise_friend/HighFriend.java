package exercise_friend;

public class HighFriend extends Friend {
	
	String work;
	
	public HighFriend(String name, String phone , String addr, String job) {
		
		super(name,phone,addr); //�θ�ü�� ������ ȣ�� 
		work = job;
	}
	
	public void showData() { //�θ�ü���� ���� �̸� ���� . �������̵� ��
		
		super.showData();
		System.out.println("���� :" + work);
	}
	
	public void showBasicInfo() {    //�θ�ü���� ���� �̸� ���� . �������̵� ��
		System.out.println("�̸� : " + name); //�ڽĿ��� name�� ���� ��Ӱ����̱� ������ �θ�ü�� name��� ����.
		System.out.println("��ȭ : " + phoneNum); 
	}

}
