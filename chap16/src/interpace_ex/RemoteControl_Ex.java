package interpace_ex;

public class RemoteControl_Ex {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
	}
}
