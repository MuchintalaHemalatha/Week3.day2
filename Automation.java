package week3.day2;

public class Automation extends MultipleLangauge {
	/*Interface :Language
    Methods   :Java()
    Interface :TestTool
    Methods   :Selenium()
    AbstractClass :MultipleLangauge
    Methods   :python() and un implemented method as ruby()
 Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/

	public int Java() {
		System.out.println("Java is a language");
		return 0;
	}

	public void Selenium() {
		System.out.println("Learning Selenium language");

	}

	@Override
	public void ruby() {
		System.out.println("ruby is a language");

	}
	public static void main(String[] args) {
		Automation lan=new Automation();
		lan.Java();
		lan.Selenium();
		lan.python();
		lan.ruby();

	}





}
