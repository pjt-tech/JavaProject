package exercise_object04;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("james",5000);
		Student tomas = new Student("tomas",10000);
		
		BUS bus100 = new BUS(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subway = new Subway("2È£¼±");
		tomas.takeSubway(subway);
		tomas.showInfo();
		subway.showInfo();
	}

}
