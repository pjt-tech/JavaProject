package exercise_object03;

public class MyDate {
	private int day , month ,year;
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public boolean isValid() {
		if(month==2) {
			if(day<28) {
				System.out.println("유효한 날짜입니다.");
			}else if(day>28) {
				System.out.println("유효하지 않은 날짜입니다.");
			}
		}
		return true; 
	}
	
	
}
