package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);		
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		//5. Print the count of the items Found. 
		String itemsCount = driver.findElement(By.className("length")).getText();
		System.out.println(itemsCount);
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("Size is:" +bagBrandList.size());	
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println("All Brand Lists are: " +text);
		}
		//7. Get the list of names of the bags and print
		List<WebElement> bagsNameLst = driver.findElements(By.className("nameCls"));
		System.out.println("Size is: "+ bagsNameLst.size());
		System.out.println("The Bags Names are: ");
			for (WebElement webElement : bagsNameLst) {
			String lst = webElement.getText();
			System.out.println(lst);	

		}
	}

}
