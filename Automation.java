package week3.day1;

public class Automation extends MultipleLanguage {


	public void Selenium() {
	
		System.out.println("Selenium Automation");
	}

	public void Java() {
	
		System.out.println("Java Programming");
	}

	@Override
	public void ruby() {
		
		System.out.println("Welcome to Ruby");
	}

	public static void main(String[] args) {
		
		Automation au = new Automation();
		au.Java();
		au.Selenium();
		au.python();
		au.ruby();
	}
}
