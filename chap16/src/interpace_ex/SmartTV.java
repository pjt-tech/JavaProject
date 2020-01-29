package interpace_ex;

public class SmartTV implements RemoteControl, Search {
	
	int volume;
	
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}
	
	public void turnOn() {
		System.out.println("SmartTV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� SmartTV ���� : " + this.volume);
		
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("SmartTV ���� ó���մϴ�.");
		}else
			System.out.println("SmartTV ���� �����մϴ�.");
	
	}
	

}
