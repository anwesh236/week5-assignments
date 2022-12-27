package week5.day2;

public class Student extends Department  {
	
	

	private static Student obj;

	public void studentName() {
		System.out.println("studentName=K.Anwesh");
	}
	public void studentDept() {
		System.out.println("studentDept=auto");
	}
	public void studentId() {
		System.out.println("studentId=113318104005");
	}
	
	public static void main(String[] args) {
		
		Student.obj=new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
		
		
		
		
	}

}

