
public class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object arg0) {

		if(arg0 instanceof Student) {
			Student student = (Student)arg0;
			return (sno==student.sno)&&(name.equals(student.name));
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		
		return sno+name.hashCode();
		
	}
	
	
	
	

}
