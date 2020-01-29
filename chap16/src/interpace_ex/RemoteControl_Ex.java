package interpace_ex;

public class RemoteControl_Ex {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		RemoteControl.changeBattery();
		rc.setVolume(12);
		rc.turnOff();
		
		SmartTV tv = new SmartTV();
		rc = tv;
		rc.setMute(true);
		Search sc = tv;
		rc.turnOn();
		sc.search("https://www.naver.com");
		rc.turnOff();
	}
}
