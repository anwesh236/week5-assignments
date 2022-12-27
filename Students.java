package week5.day2;

public class Students {
	
	public static Students obj;
	public void getstudentInfo(int studentnum) {
		System.out.println("studentnum");
	}
	public void getstudentInfo(String studentname) {
		System.out.println("studentname");
	}
	public void getstudentInfo(String emailid ,int phonenum) {
		System.out.println(emailid+","+phonenum);
	}
	public static void main(String[] args) {
		Students.obj=new Students();
		obj.getstudentInfo(113351);
		obj.getstudentInfo("anwesh");
		obj.getstudentInfo("anwesh2000@gmail.com",95146850);
		
				
		
		
		
	}
		
	}


