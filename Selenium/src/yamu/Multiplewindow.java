package yamu;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.gmail.com");
		//How to handle child window(multiple windows)
		//driver.findElement(By.xpath("//html/body/div[2]/div[1]/div[4]/ul[1]/li[1]/a")).click();)
		System.out.println(driver.getTitle());
		//To print the name of all opened windows name.
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid = it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		
		

		
		
	}

}
