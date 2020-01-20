package inheritance;

public class DMBCellPhone extends CellPhone {
	
	int channel;

	public DMBCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void trunOnDMB() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDMB() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
