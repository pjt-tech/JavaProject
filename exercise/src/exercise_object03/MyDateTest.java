package exercise_object03;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(10,2,2020);
		System.out.println(date.isValid());
		MyDate date1 = new MyDate(30,2,2020);
		System.out.println(date1.isValid());

	}

}
