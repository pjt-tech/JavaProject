package inheritance;

public class DMBCellPhone_Example {

	public static void main(String[] args) {
		
		DMBCellPhone dmbCellPhone = new DMBCellPhone("갤럭시s10","블랙",10);
		
		System.out.println("모델 :" + dmbCellPhone.model);
		System.out.println("색상 :" + dmbCellPhone.color);
		System.out.println("채널 :" + dmbCellPhone.channel);
		
		dmbCellPhone.poworON();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receibeVoice("안녕하세요! 저는 홍길동 입니다.");
		dmbCellPhone.sendVoice("예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.trunOnDMB();
		dmbCellPhone.changeChannelDMB(12);
		dmbCellPhone.turnOffDMB();
	}

}
