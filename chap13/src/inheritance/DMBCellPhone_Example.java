package inheritance;

public class DMBCellPhone_Example {

	public static void main(String[] args) {
		
		DMBCellPhone dmbCellPhone = new DMBCellPhone("������s10","��",10);
		
		System.out.println("�� :" + dmbCellPhone.model);
		System.out.println("���� :" + dmbCellPhone.color);
		System.out.println("ä�� :" + dmbCellPhone.channel);
		
		dmbCellPhone.poworON();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receibeVoice("�ȳ��ϼ���! ���� ȫ�浿 �Դϴ�.");
		dmbCellPhone.sendVoice("�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.trunOnDMB();
		dmbCellPhone.changeChannelDMB(12);
		dmbCellPhone.turnOffDMB();
	}

}
