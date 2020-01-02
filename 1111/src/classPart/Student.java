package classPart;

public class Student {
	
	int studentID = 76;
	String studentName = "ty";
	int grade =1;
	String address = "backje";


	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[ ] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
