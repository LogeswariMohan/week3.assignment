package week3.assignmentss;

public class Automation extends MultipleLangauge implements TestTool,Language {

	@Override
	public void ruby() {
		System.out.println("Its a open source programing langauge");		
	}

	@Override
	public void java() {
		System.out.println("Java is a high-level programming Language");
	}

	@Override
	public void Selenium() {
		System.out.println("It is a chemical element");		
	}
	
	public void C() {
		System.out.println("It is 3rd letter in alaphabet");
	}
	
public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java();
		auto.Selenium();
		auto.ruby();
		auto.C();

	}

}
