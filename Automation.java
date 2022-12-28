package week5.Day3;

public class Automation extends MultipleLangauge implements Language,Testtool {

	public void selenium() {
		
		System.out.println("selenium");
		// TODO Auto-generated method stub
		
	}

	public void java() {
		
		System.out.println("java");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Algorithm() {
		
		System.out.println("Algorithm");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Automation Automation=new Automation();
		Automation.selenium();
		Automation.java();
		Automation.Algorithm();
		
	}

}
