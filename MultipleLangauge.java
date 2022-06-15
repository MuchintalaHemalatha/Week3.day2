package week3.day2;

public abstract class MultipleLangauge implements Language,TestTool{
	/*Interface :Language
    Methods   :Java()
    Interface :TestTool
    Methods   :Selenium()
    AbstractClass :MultipleLangauge
    Methods   :python() and un implemented method as ruby()
 Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/
	public void python()
	{
		System.out.println("python is a language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub

	}
	public int Java() {
		return 0;
	}


	public abstract void ruby();
}
