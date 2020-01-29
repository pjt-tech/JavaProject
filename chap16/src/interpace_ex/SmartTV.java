package interpace_ex;

public class SmartTV implements RemoteControl, Search {
	
	int volume;
	
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
		
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
		System.out.println("현재 SmartTV 볼륨 : " + this.volume);
		
	}

}
