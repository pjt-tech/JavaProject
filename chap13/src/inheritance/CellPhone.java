package inheritance;

public class CellPhone {
	
	String model;
	String color;
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void poworON() {
		
		System.out.println("������ �մϴ�.");
	}

	void poworOff() {
		
		System.out.println("������ ���ϴ�.");
	}
	
	void bell() {
		
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String message) {
		
		System.out.println("�ڽ� :" + message);
	}
	void receibeVoice(String message) {
		
		System.out.println("���� :" + message);
	}
	
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
