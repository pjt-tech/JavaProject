package polymorphism;

public class Driver_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		/*
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(bus);
		*/
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(bus);
	}

}
